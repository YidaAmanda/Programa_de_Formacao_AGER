package br.com.amanda.adopet.api.validacoes;

import br.com.amanda.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.amanda.adopet.api.exception.ValidacaoException;
import br.com.amanda.adopet.api.model.Pet;
import br.com.amanda.adopet.api.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidacaoPetDisponivel implements ValidacaoSolicitacaoAdocao {

    @Autowired
    private PetRepository petRepository;

    public void validar(SolicitacaoAdocaoDto dto) {
        Pet pet = petRepository.getReferenceById(dto.idPet());
        if (pet.getAdotado()) {
            throw new ValidacaoException("Pet já foi adotado!");
        }
    }

}
