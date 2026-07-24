package br.com.amanda.screenmatch.Principal;

import br.com.amanda.screenmatch.calculos.CalculadoraDeTempo;
import br.com.amanda.screenmatch.calculos.FiltroRecomendacao;
import br.com.amanda.screenmatch.models.Episodio;
import br.com.amanda.screenmatch.models.Filme;
import br.com.amanda.screenmatch.models.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println("------");
        Filme meuFilme = new Filme("Até que as cores acabem", 2024, 120, true); //tipo referência
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMediaAvaliacoes());

        System.out.println("------");
        Filme outroFilme = new Filme("Given: The Movie", 2020, 59, false); //tipo referência
        outroFilme.exibeFichaTecnica();

        outroFilme.avalia(6);
        outroFilme.avalia(6);

        System.out.println(outroFilme.getTotalDeAvaliacoes());
        System.out.println(outroFilme.pegaMediaAvaliacoes());

        System.out.println("------");
        Serie minhaSerie = new Serie("Because this is my first life", 2017, true, 1, 16, 75);
        minhaSerie.exibeFichaTecnica();

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

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.get(0).toString());

        System.out.println(listaDeFilmes);

        //int[] numeros = new int[5];
        //var (Java 10)
    }
}
