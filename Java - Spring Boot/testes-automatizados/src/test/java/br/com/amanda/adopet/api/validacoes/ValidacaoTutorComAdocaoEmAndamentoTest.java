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
class ValidacaoTutorComAdocaoEmAndamentoTest {
    @Mock
    private AdocaoRepository adocaoRepository;
    @Mock
    private SolicitacaoAdocaoDto dto;

    @InjectMocks
    private ValidacaoTutorComAdocaoEmAndamento validador;

    @Test
    @DisplayName("Não permite solicitação de adoção para tutor com adoção em andamento")
    void naoPertimirAdocao() {
        //ARRANGE
        given(adocaoRepository.existsByTutorIdAndStatus(dto.idTutor(), StatusAdocao.AGUARDANDO_AVALIACAO)).willReturn(true);

        //ACT + ASSERT
        assertThrows(ValidacaoException.class, () -> validador.validar(dto));
    }

    @Test
    @DisplayName("Permite solicitação de adoção para tutor sem adoção em andamento")
    void pertimirAdocao() {
        //ARRANGE
        given(adocaoRepository.existsByTutorIdAndStatus(dto.idTutor(), StatusAdocao.AGUARDANDO_AVALIACAO)).willReturn(false);

        //ACT + ASSERT
        assertDoesNotThrow(() -> validador.validar(dto));
    }

}