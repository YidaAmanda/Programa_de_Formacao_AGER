package br.com.amanda.screenmatch.models;

import br.com.amanda.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private int epsodiosPorTemporadas;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento, boolean incluidoNoPlano, int temporadas, int episodiosPorTemporadas, int minutosPorEpisodio) {
        super(nome, anoDeLancamento, incluidoNoPlano);
        this.temporadas = temporadas;
        this.epsodiosPorTemporadas = episodiosPorTemporadas;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    /* Setters */
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    /* Setters */

    /* Getters */
    public int getTemporadas() {
        return temporadas;
    }

    public int getEpsodiosPorTemporadas() {
        return epsodiosPorTemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos () {
        return temporadas * epsodiosPorTemporadas * minutosPorEpisodio;
    }
    /* Getters */

    @Override
    public int getClassificacao () {
        return (int) pegaMediaAvaliacoes() / 2;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Duração em minutos: " + this.getDuracaoEmMinutos());
        System.out.println("Incluído no plano: " + (this.isIncluidoNoPlano() ? "Sim" : "Não"));
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
