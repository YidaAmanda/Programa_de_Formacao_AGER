package br.com.amanda.screenmatch.principal;

import br.com.amanda.screenmatch.model.*;
import br.com.amanda.screenmatch.repository.SerieRepository;
import br.com.amanda.screenmatch.service.ConsumoApi;
import br.com.amanda.screenmatch.service.ConverteDados;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";
    private List<Serie> series = new ArrayList<>();
    private Optional<Serie> serieBusca;

    private SerieRepository repositorio;
    public Principal(SerieRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu() {
        int opcao;
        var menu = """
                1 - Buscar séries
                2 - Buscar episódios
                3 - Listar series buscadas
                4 - Buscar série por título
                5 - Buscar séries por ator
                6 - Top 5 séries
                7 - Buscar séries por gênero
                8 - Recomendar séries
                9 - Buscar episódio por trecho
                10 - Top 5 episódios por série
                11 - Buscar episódios desde uma data
                
                0 - Sair
                """;

        do{
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    buscarSerieWeb();
                    break;
                case 2:
                    buscarEpisodioPorSerie();
                    break;
                case 3:
                    listarSeriesBuscadas();
                    break;
                case 4:
                    buscarSeriePorTitulo();
                    break;
                case 5:
                    buscarSeriesPorAutor();
                    break;
                case 6:
                    buscarTop5Series();
                    break;
                case 7:
                    buscarSeriesPorCategoria();
                    break;
                case 8:
                    recomendarSeriesPorTemporadaEAvaliacao();
                    break;
                case 9:
                    buscarEpisodioPorTrecho();
                case 10:
                    buscarTop5EpisodiosPorSerie();
                    break;
                case 11:
                    buscarEpisodiosDepoisDeUmaData();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 0);
    }

    private void buscarSerieWeb() {
        DadosSerie dados = getDadosSerie();
        //dadosSeries.add(dados);
        Serie serie = new Serie(dados);
        repositorio.save(serie);
        System.out.println(dados);
    }

    private DadosSerie getDadosSerie() {
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        return dados;
    }

    private void buscarEpisodioPorSerie(){
        //DadosSerie dadosSerie = getDadosSerie();
        listarSeriesBuscadas();
        System.out.println("Escolha uma série pelo nome: ");
        String nomeSerie = leitura.nextLine();

        Optional<Serie> serie = repositorio.findByTituloContainingIgnoreCase((nomeSerie));
        /*Optional<Serie> serie = series.stream()
                .filter(s -> s.getTitulo().toLowerCase().contains(nomeSerie.toLowerCase()))
                .findFirst();*/

        if(serie.isPresent()){
            Serie serieEncontrada = serie.get();
            List<DadosTemporada> temporadas = new ArrayList<>();

            for (int i = 1; i <= serieEncontrada.getTotalTemporadas(); i++) {
                var json = consumo.obterDados(ENDERECO + serieEncontrada.getTitulo().replace(" ", "+") + "&season=" + i + API_KEY);
                DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
                temporadas.add(dadosTemporada);
            }
            temporadas.forEach(System.out::println);

            List<Episodio> episodios = temporadas.stream()
                    .flatMap(d -> d.episodios().stream()
                            .map(e -> new Episodio(d.numero(), e)))
                    .collect(Collectors.toList());

            serieEncontrada.setEpisodios(episodios);
            repositorio.save(serieEncontrada);
        } else {
            System.out.println("Serie não encontrada");
        }
    }

    private void listarSeriesBuscadas() {
        series = repositorio.findAll();
        /*series = dadosSeries.stream()
                            .map(d -> new Serie(d))
                            .collect((Collectors.toList()));*/

        series.stream()
              .sorted(Comparator.comparing(Serie::getGenero))
              .forEach(System.out::println);
    }

    private void buscarSeriePorTitulo(){
        System.out.println("Escolha uma série pelo nome: ");
        String nomeSerie = leitura.nextLine();
        serieBusca = repositorio.findByTituloContainingIgnoreCase((nomeSerie));

        if(serieBusca.isPresent()){
            System.out.println("Dados da série: " + serieBusca.get());
        } else {
            System.out.println("Série não encontrada");
        }
    }

    private void buscarSeriesPorAutor(){
        System.out.print("Digite o nome do ator: ");
        String nomeAtor = leitura.nextLine();
        List<Serie> seriesEncontradas = repositorio.findByAtoresContainingIgnoreCase(nomeAtor);
        System.out.println("Séries em que " + nomeAtor + " trabalhou: ");
        seriesEncontradas.forEach(s ->
                System.out.println(s.getTitulo() + s.getAvaliacao()));
        /*System.out.print("Digite o minimo das avaliações: ");
        Double avaliacao = leitura.nextDouble();
        leitura.nextLine();
        List<Serie> seriesEncontradas = repositorio.findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(nomeAtor, avaliacao);
        System.out.println("Séries em que " + nomeAtor + " trabalhou: ");
        seriesEncontradas.forEach(s ->
                System.out.println(s.getTitulo() + s.getAvaliacao()));*/
    }

    private void buscarTop5Series(){
        List<Serie> seriesTop = repositorio.findTop5ByOrderByAvaliacaoDesc();
        seriesTop.forEach(s ->
                System.out.println(s.getTitulo() + " " + s.getAvaliacao()));
    }

    private void buscarSeriesPorCategoria(){
        System.out.println("Digite o gênero: ");
        String nomeGenero = leitura.nextLine();
        Categoria categoria = Categoria.fromPtbr(nomeGenero);
        List<Serie> seriesPorCategoria = repositorio.findByGenero(categoria);

        System.out.println("Series do gênero " + nomeGenero + ": ");
        seriesPorCategoria.forEach(System.out::println);
    }

    private void recomendarSeriesPorTemporadaEAvaliacao(){
        System.out.print("Recomendar séries até quantas temporadas: ");
        int totalTemporadas = leitura.nextInt();
        leitura.nextLine();
        System.out.print("A partir da avaliacao: ");
        double avaliacao = leitura.nextDouble();
        leitura.nextLine();

        //List<Serie> filtroSeries = repositorio.findByTotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual(totalTemporadas, avaliacao);
        List<Serie> filtroSeries = repositorio.seriesPorTemporadaEAvaliacao(totalTemporadas, avaliacao);
        System.out.println("Séries Recomendadas: ");
        filtroSeries.forEach(s ->
                System.out.println(s.getTitulo() + " " + s.getAvaliacao()));
    }

    private void buscarEpisodioPorTrecho(){
        System.out.print("Digite o nome do episódio: ");
        String trechoEpisodio = leitura.nextLine();
        List<Episodio> episodiosEncontrados = repositorio.episodiosPorTrecho(trechoEpisodio);
        System.out.println("Episódios: ");
        episodiosEncontrados.forEach(e ->
                System.out.printf("Série: %s Temporada: %s - Episódios: %s - %s\n",
                        e.getSerie().getTitulo(), e.getTemporada(),
                        e.getNumeroEpisodio(), e.getTitulo()));
    }

    private void buscarTop5EpisodiosPorSerie(){
        buscarSeriePorTitulo();
        if(serieBusca.isPresent()){
            Serie serie = serieBusca.get();
            List<Episodio> topEpisodios = repositorio.topEpisodiosPorSerie(serie);
            topEpisodios.forEach(e ->
                    System.out.printf("Série: %s Temporada: %s - Episódios: %s - %s Avaliação: %s\n",
                            e.getSerie().getTitulo(), e.getTemporada(),
                            e.getNumeroEpisodio(), e.getTitulo(),
                            e.getAvaliacao()));
        }
    }

    private void buscarEpisodiosDepoisDeUmaData(){
        buscarSeriePorTitulo();
        if(serieBusca.isPresent()){
            Serie serie = serieBusca.get();
            System.out.print("Digite o ano limite de lançamento: ");
            int anoLancamento = leitura.nextInt();
            leitura.nextLine();

            List<Episodio> episodiosAno = repositorio.episodiosPorSerieEAno(serie, anoLancamento);
            episodiosAno.forEach(System.out::println);
        }
    }
}