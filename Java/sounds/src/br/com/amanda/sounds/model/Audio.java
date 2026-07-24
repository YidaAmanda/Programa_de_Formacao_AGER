package br.com.amanda.sounds.model;

public class Audio {
    private String titulo;
    private int duracaoEmMinutos;
    private int totalDeReproducao;
    private int totalCurtidas;
    private int classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void curte () {
        this.totalCurtidas++;
    }

    public void reproduz () {
        this.totalDeReproducao++;
    }
}
