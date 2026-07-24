package br.com.amanda.screenmatch.models;

import br.com.amanda.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano) {
        super(nome, anoDeLancamento, incluidoNoPlano);
        this.setDuracaoEmMinutos(duracaoEmMinutos);
    }

    /* Setters */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    /* Setters */

    /* Getters */
    public String getDiretor() {
        return diretor;
    }
    /* Getters */

    @Override
    public int getClassificacao () {
        return (int) pegaMediaAvaliacoes() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}