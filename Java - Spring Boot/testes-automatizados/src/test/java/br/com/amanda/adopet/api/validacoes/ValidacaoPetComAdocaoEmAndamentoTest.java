package br.com.amanda.adopet.api.validacoes;

import br.com.amanda.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.amanda.adopet.api.exception.ValidacaoException;
import br.com.amanda.adopet.api.model.StatusAdocao;
import br.com.amanda.adopet.api.repository.AdocaoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class ValidacaoPetComAdocaoEmAndamentoTest {
    @Mock
    private AdocaoRepository adocaoRepository;
    @Mock
    private SolicitacaoAdocaoDto dto;

    @InjectMocks
    private ValidacaoPetComAdocaoEmAndamento validador;

    @Test
    @DisplayName("Não permite solicitação de adoção de pet com pedido em andamento")
    void naoPertimirAdocaoCenario1() {
        //Arrange
        given(adocaoRepository.existsByPetIdAndStatus(
                dto.idPet(),
                StatusAdocao.AGUARDANDO_AVALIACAO)
        ).willReturn(true);

        //Act + Assert
        assertThrows(ValidacaoException.class, () -> validador.validar(dto));
    }

    @Test
    @DisplayName("Permite solicitação de adoção de pet com pedido inexistente")
    void pertimirAdocaoCenario1() {
        //Arrange
        given(adocaoRepository.existsByPetIdAndStatus(
                dto.idPet(),
                StatusAdocao.AGUARDANDO_AVALIACAO
        )).willReturn(false);

        //Act + Assert
        assertDoesNotThrow(()->validador.validar(dto));
    }

}
