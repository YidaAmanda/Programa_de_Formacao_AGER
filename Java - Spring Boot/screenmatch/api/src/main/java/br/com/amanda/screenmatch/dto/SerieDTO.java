package br.com.amanda.screenmatch.dto;

import br.com.amanda.screenmatch.model.Categoria;

public record SerieDTO(Long id, String titulo, Integer totalTemporadas,
                       Double avaliacao, Categoria genero, String atores,
                       String poster, String sinopse) {
}
