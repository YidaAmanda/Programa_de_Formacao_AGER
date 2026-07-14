package br.com.amanda;

import br.com.amanda.model.Endereco;
import br.com.amanda.model.EnderecoViaCep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String cep = "";
        List<Endereco> enderecos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        do {
            System.out.print("\nDigite um cep (ou 'sair' para sair): ");
            cep = scanner.nextLine();
            if (cep.equalsIgnoreCase("sair")){
                break;
            }

            String busca = "https://viacep.com.br/ws/" + cep + "/json/";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(busca))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                //System.out.println(json);
                EnderecoViaCep enderecoViaCep = gson.fromJson(json, EnderecoViaCep.class);
                //System.out.println(enderecoViaCep);

                Endereco endereco = new Endereco(enderecoViaCep);
                System.out.println(endereco);
                enderecos.add(endereco);
            } catch (Exception e) {
                System.out.println("error");
                System.out.println(e.getMessage());
            }
        } while(!cep.equalsIgnoreCase("sair"));

        scanner.close();
        System.out.println(enderecos);

        FileWriter writer = new FileWriter("enderecos.json");
        writer.write(gson.toJson(enderecos));
        writer.close();

    }
}
