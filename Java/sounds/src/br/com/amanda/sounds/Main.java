package br.com.amanda.sounds;

import br.com.amanda.sounds.model.Musica;
import br.com.amanda.sounds.model.Podcast;
import br.com.amanda.sounds.model.Preferidas;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.setTitulo("Umi e");
        musica.setArtista("syh");

        for (int i = 0; i < 100; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Não sei");
        podcast.setApresentador("Nome");

        for (int i = 0; i < 50; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 15; i++) {
            podcast.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}
