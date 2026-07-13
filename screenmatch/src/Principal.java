import br.com.amanda.screenmatch.calculos.CalculadoraDeTempo;
import br.com.amanda.screenmatch.calculos.FiltroRecomendacao;
import br.com.amanda.screenmatch.models.Episodio;
import br.com.amanda.screenmatch.models.Filme;
import br.com.amanda.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        System.out.println("------");
        Filme meuFilme = new Filme(); //tipo referência
        meuFilme.setNome("Até que as cores acabem");
        meuFilme.setAnoDeLancamento(2024);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMediaAvaliacoes());

        System.out.println("------");
        Filme outroFilme = new Filme(); //tipo referência
        outroFilme.setNome("Given: The Movie");
        outroFilme.setAnoDeLancamento(2020);
        outroFilme.setDuracaoEmMinutos(59);
        outroFilme.setIncluidoNoPlano(false);

        outroFilme.exibeFichaTecnica();

        outroFilme.avalia(6);
        outroFilme.avalia(6);

        System.out.println(outroFilme.getTotalDeAvaliacoes());
        System.out.println(outroFilme.pegaMediaAvaliacoes());

        System.out.println("------");
        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Because this is my first life");
        minhaSerie.setAnoDeLancamento(2017);
        minhaSerie.setTemporadas(1);
        minhaSerie.setEpsodiosPorTemporadas(16);
        minhaSerie.setMinutosPorEpisodio(75);
        minhaSerie.setIncluidoNoPlano(true);

        minhaSerie.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + minhaSerie.getDuracaoEmMinutos());

        minhaSerie.avalia(2);
        minhaSerie.avalia(3);

        System.out.println(minhaSerie.getTotalDeAvaliacoes());
        System.out.println(minhaSerie.pegaMediaAvaliacoes());

        System.out.println("------");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("------");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(outroFilme);
        filtro.filtra(minhaSerie);

        System.out.println("------");
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNome("Primeiro");
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(84);
        filtro.filtra(episodio);
    }
}
