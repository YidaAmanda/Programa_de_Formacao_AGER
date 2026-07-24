package br.com.amanda.screenmatch.Principal;

import br.com.amanda.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.amanda.screenmatch.models.Titulo;
import br.com.amanda.screenmatch.models.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
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

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String filme = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        do {
            System.out.print("Digite um filme: ");
            filme = scanner.nextLine();

            if (filme.equalsIgnoreCase("sair"))
                break;

            String busca = "https://www.omdbapi.com/?t=" + filme.replace(" ", "+") + "&apikey=831ab8f";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(busca))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println(meuTitulo);
                titulos.add(meuTitulo);

                /*FileWriter escrita = new FileWriter("filmes.txt");
                escrita.write(meuTitulo.toString());
                escrita.close();*/
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Ocorreu um erro na buca, verifique o endereço");
            }  catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
                //} catch (Exception e) {
                //    System.out.println("Ocorreu algo");
            } /*finally {
            System.out.println("Fim feliz!");
        }*/
        } while (!filme.equalsIgnoreCase("sair"));

        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println("Fim feliz!");
        scanner.close();
    }
}

/*multi-catch
try {
    metodoQuePodeLancarExcecao();
} catch (NullPointerException | IllegalArgumentException e) {
    System.out.println("tratando erro...");
}
o uso de multi-catch só é permitido para exceções que não estão relacionadas por uma hierarquia de herança*/

/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraDeArquivo {
    public static void main(String[] args) {
        try {
            File arquivo = new File("arquivo.json");
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
*/
