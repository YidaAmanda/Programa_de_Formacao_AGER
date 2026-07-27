package br.com.amanda.adopet.api.validacoes;

import br.com.amanda.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.amanda.adopet.api.exception.ValidacaoException;
import br.com.amanda.adopet.api.model.Pet;
import br.com.amanda.adopet.api.repository.PetRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ValidacaoPetDisponivelTest {
    @Mock
    private PetRepository petRepository;
    @Mock
    private Pet pet;
    @Mock
    private SolicitacaoAdocaoDto dto;
    @InjectMocks
    private ValidacaoPetDisponivel validacao;

    @Test
    @DisplayName("Permite adoção de pet disponível")
    void pertimirAdocaoCenario1() {
        //ARRANGE
        BDDMockito.given(petRepository.getReferenceById(dto.idPet())).willReturn(pet);
        BDDMockito.given(pet.getAdotado()).willReturn(false);

        //ASSERT + ACT
        Assertions.assertDoesNotThrow(() -> validacao.validar(dto));
    }

    @Test
    @DisplayName("Não permite adoção de pet indisponível")
    void naoPertimirAdocaoCenario1() {
        //ARRANGE
        BDDMockito.given(petRepository.getReferenceById(dto.idPet())).willReturn(pet);
        BDDMockito.given(pet.getAdotado()).willReturn(true);

        //ASSERT + ACT
        Assertions.assertThrows(ValidacaoException.class, () -> validacao.validar(dto));
    }
}