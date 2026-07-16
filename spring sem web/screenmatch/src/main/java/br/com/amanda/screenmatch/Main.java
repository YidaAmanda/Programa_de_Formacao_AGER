package br.com.amanda.screenmatch;

import br.com.amanda.screenmatch.model.DadosEpisodio;
import br.com.amanda.screenmatch.model.DadosSerie;
import br.com.amanda.screenmatch.model.DadosTemporada;
import br.com.amanda.screenmatch.model.Episodio;
import br.com.amanda.screenmatch.service.ConsumoApi;
import br.com.amanda.screenmatch.service.ConverteDados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private final String ENDERECO = "https://www.omdbapi.com/?t="; //snake_case
    private final String API_KEY = "&apikey=831ab8f";
    private Scanner scanner = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu(){
        System.out.print("Digite o nome da serie: ");
        String nome = scanner.nextLine().replace(" ", "+");

        String json = consumoApi.obterDados(ENDERECO + nome + API_KEY);
        DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);

        List<DadosTemporada> dadosTemporadas = new ArrayList<>();

        for (int i = 1; i <= dadosSerie.totalTemporadas(); i++) {
            json = consumoApi.obterDados(ENDERECO + nome + "&season="+ i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            dadosTemporadas.add(dadosTemporada);
        }

        dadosTemporadas.forEach(System.out::println);

        /*for (int i = 0; i < serie.totalTemporadas(); i++) {
            List<Episodio> episodios = temporadas.get(i).episodios();
            for (int j = 0; j < episodios.size(); j++) {
                System.out.println(episodios.get(j).titulo());
            }
        }*/
        dadosTemporadas.forEach(t -> t.dadosEpisodios()
                .forEach(e -> System.out.println(e.titulo())));

        List<String> nomes = Arrays.asList("Joao<3", "Amanda", "Maria", "JoaoMaria");
        nomes.stream()
                .sorted()
                .limit(2)
                .filter(n -> n.startsWith("J"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);

//        List<DadosEpisodio> dadosEpisodios = dadosTemporadas.stream()
//                .flatMap(t -> t.dadosEpisodios().stream())
//                .collect(Collectors.toList());
//              //.toList(); //lista imutavel
//
//        dadosEpisodios.stream()
//                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
//              //.peek(e -> System.out.println("Primeiro filtro(N/A) " + e))
//                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
//              //.peek(e -> System.out.println("Ordenação " + e))
//                .limit(10)
//              //.peek(e -> System.out.println("Limitação " + e))
//                .map(e -> e.titulo().toUpperCase())
//              //.peek(e -> System.out.println("Mapeamento " + e))
//                .forEach(System.out::println);

        /*List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int soma = numeros.stream()
                        .peek(n -> System.out.println("Elemento: " + n))
                        .map(n -> n * 2)
                        .peek(n -> System.out.println("Conteúdo depois do map: " + n))
                        .reduce(0, (total, numero) -> total + numero);
        System.out.println("A soma dos números é: " + soma);*/

        List<Episodio> episodios = dadosTemporadas.stream()
                .flatMap(t -> t.dadosEpisodios().stream()
                        .map(d -> new Episodio(t.numero(), d)))
                .collect(Collectors.toList());

        episodios.forEach(System.out::println);

//        System.out.print("Digite o nome do episodio: ");
//        String trechoTitulo = scanner.nextLine();
//        Optional<Episodio> episodioBuscado = episodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
//                .findFirst();
//        if (episodioBuscado.isPresent()) {
//            System.out.println("Episodio encontrado!");
//            System.out.println("Temporada: " + episodioBuscado.get().getTemporada());
//        } else {
//            System.out.println("Episodio não encontrado :(");
//        }

//        System.out.print("Desde que ano deseja ver os episódios: ");
//        int ano = scanner.nextInt();
//        scanner.nextLine();
//
//        LocalDate dataBusca = LocalDate.of(ano, 1, 1);
//        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //df ou dtf
//        episodios.stream()
//                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento()
//                        .isAfter(dataBusca))
//                .forEach(e -> System.out.println(
//                        "Temporada: " + e.getTemporada() +
//                        " Episódio: " + e.getTitulo() +
//                        " Data Lançamento: " + e.getDataLancamento().format(formatador)
//                ));
                /*.forEach(e -> {

                });*/

        Map<Integer, Double> avaliacoesPorTemporada = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getAvaliacao)));
        System.out.println(avaliacoesPorTemporada);

        DoubleSummaryStatistics est = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));
        System.out.println("Média: " + est.getAverage());
        System.out.println("Melhor episódio: " + est.getMax());
        System.out.println("Pior episódio: " + est.getMin());
        System.out.println("Quantidade: " + est.getCount());
    }
}
