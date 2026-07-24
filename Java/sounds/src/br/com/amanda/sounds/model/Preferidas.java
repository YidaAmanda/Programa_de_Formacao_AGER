package br.com.amanda.sounds.model;

public class Preferidas {
    public void inclui (Audio audio) {
        if (audio.getClassificacao() > 8) {
            System.out.println(audio.getTitulo() + " é amado!");
        } else {
            System.out.println("Ouça também: " + audio.getTitulo());
        }
    }
}
