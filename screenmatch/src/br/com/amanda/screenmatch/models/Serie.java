package br.com.amanda.screenmatch.models;

import br.com.amanda.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private int epsodiosPorTemporadas;
    private boolean ativa;
    private int minutosPorEpisodio;

    /* Setters */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpsodiosPorTemporadas(int epsodiosPorTemporadas) {
        this.epsodiosPorTemporadas = epsodiosPorTemporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
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
}
