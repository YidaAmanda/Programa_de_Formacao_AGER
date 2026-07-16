package br.com.amanda.tabelafipe;

import br.com.amanda.tabelafipe.model.Dados;
import br.com.amanda.tabelafipe.model.DadosModelo;
import br.com.amanda.tabelafipe.model.DadosVeiculo;
import br.com.amanda.tabelafipe.service.ConsomeApi;
import br.com.amanda.tabelafipe.service.ConverteDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";//43/modelos/7166/anos/2018-5";
    private Scanner scanner = new Scanner(System.in);
    private ConsomeApi consomeApi = new ConsomeApi();
    private String json;
    ConverteDados converteDados = new ConverteDados();

    public void exibeMenu() {
        System.out.println("""
                ------Opções------
                1. Carro
                2. Motocicleta
                3. Caminhão
                """);
        System.out.print("Digite o número da opção: ");

        switch (scanner.nextInt()){
            case 1:
                executa("carros");
                break;
            case 2:
                executa("motos");
                break;
            case 3:
                executa("caminhoes");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private void executa(String tipo){
        scanner.nextLine();
        String endereco = URL_BASE + tipo + "/marcas/";
        json = consomeApi.obterDados(endereco);
        System.out.println(json);

        List<Dados> marcas = converteDados.obterLista(json, Dados.class);
        marcas.stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        System.out.print("\nInforme o código da marca: ");
        endereco += scanner.nextLine() + "/modelos/";
        json = consomeApi.obterDados(endereco);
        DadosModelo modeloLista = converteDados.obterDados(json, DadosModelo.class);

        System.out.println("Modelos: ");
        modeloLista.modelos().stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        System.out.print("\nInforme o nome do carro: ");
        String nomeModelo = scanner.nextLine();
        List<Dados> modelosFiltrados = modeloLista.modelos().stream()
                .filter(m -> m.nome().toLowerCase().contains(nomeModelo.toLowerCase()))
                .collect(Collectors.toList());
        System.out.println("Modelos filtrados: ");
        modelosFiltrados.forEach(System.out::println);

        System.out.print("\nInforme código do modelo: ");
        String codigoModelo = scanner.nextLine();

        endereco += codigoModelo + "/anos/";
        json = consomeApi.obterDados(endereco);
        List<Dados> anos = converteDados.obterLista(json, Dados.class);
        List<DadosVeiculo> veiculos = new ArrayList<>();

        for (int i = 0; i < anos.size(); i++) {
            json = consomeApi.obterDados(endereco + anos.get(i).codigo());
            DadosVeiculo veiculo = converteDados.obterDados(json, DadosVeiculo.class);
            veiculos.add(veiculo);
        }

        System.out.println("Veiculos filtrados: ");
        veiculos.forEach(System.out::println);
    }
}
