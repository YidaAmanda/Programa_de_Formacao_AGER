package br.com.amanda.screenmatch.Principal;

import br.com.amanda.screenmatch.models.Filme;
import br.com.amanda.screenmatch.models.Serie;
import br.com.amanda.screenmatch.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        System.out.println("------");
        Filme meuFilme = new Filme("Até que as cores acabem", 2024, 120, true);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Given: The Movie", 2020, 59, false);
        outroFilme.avalia(9);
        Serie minhaSerie = new Serie("Because this is my first life", 2017, true, 1, 16, 75);
        minhaSerie.avalia(8);
        System.out.println("------");
        List<Titulo> list = new ArrayList<>();
        list.add(meuFilme);
        list.add(outroFilme);
        list.add(minhaSerie);

        for (Titulo item : list) {
            System.out.println(item);
            //Pattern Matching
            if (item instanceof Filme filme){
                System.out.println(filme.getClassificacao());
            }
            if (item instanceof Serie serie){
                System.out.println(serie.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("syh");
        buscaPorArtista.add("given");
        buscaPorArtista.add("Joao");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(list);
        list.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(list);
    }
}

//variáveis de referência