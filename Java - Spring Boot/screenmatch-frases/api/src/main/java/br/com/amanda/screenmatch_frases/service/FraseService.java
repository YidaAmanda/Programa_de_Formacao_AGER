package br.com.amanda.screenmatch_frases.service;

import br.com.amanda.screenmatch_frases.dto.FraseDTO;
import br.com.amanda.screenmatch_frases.model.Frase;
import br.com.amanda.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repository.sorteioFrase();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
