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

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class ValidacaoTutorComLimiteDeAdocoesTest {
    @Mock
    private AdocaoRepository adocaoRepository;
    @Mock
    private SolicitacaoAdocaoDto dto;

    @InjectMocks
    private ValidacaoTutorComLimiteDeAdocoes validador;

    @Test
    @DisplayName("Não permite solicitação de adoção para tutor que atingiu limite de 5 adoções")
    void naoPertimirAdocao() {
        //Arrange
        given(adocaoRepository.countByTutorIdAndStatus(dto.idTutor(),StatusAdocao.APROVADO)).willReturn(5);

        //ACT + ASSERT
        assertThrows(ValidacaoException.class,() ->validador.validar(dto));
    }

    @Test
    @DisplayName("Permite solicitação de adoção para tutor que não atingiu limite de 5 adoções")
    void pertimirAdocao() {
        //ARRAANGE
        given(adocaoRepository.countByTutorIdAndStatus(dto.idTutor(),StatusAdocao.APROVADO)).willReturn(4);

        //ACT + ASSERT
        assertDoesNotThrow(() -> validador.validar(dto));
    }

}