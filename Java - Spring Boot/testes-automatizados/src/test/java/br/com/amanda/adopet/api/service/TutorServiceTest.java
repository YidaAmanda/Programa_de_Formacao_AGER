package br.com.amanda.adopet.api.service;

import br.com.amanda.adopet.api.dto.AtualizacaoTutorDto;
import br.com.amanda.adopet.api.dto.CadastroTutorDto;
import br.com.amanda.adopet.api.exception.ValidacaoException;
import br.com.amanda.adopet.api.model.Tutor;
import br.com.amanda.adopet.api.repository.TutorRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class TutorServiceTest {
    @Mock
    private TutorRepository repository;
    @Mock
    private CadastroTutorDto dto;
    @Mock
    private Tutor tutor;
    @Mock
    private AtualizacaoTutorDto atualizacaoTutorDto;

    @InjectMocks
    private TutorService service;

    @Test
    @DisplayName("Não cadastrar tutor. email ou telefone ja cadastrado")
    void naoCadastrarTutor() {
        //ARRANGE + ACT
        given(repository.existsByTelefoneOrEmail(dto.telefone(), dto.email())).willReturn(true);

        //ASSERT
        assertThrows(ValidacaoException.class, () -> service.cadastrar(dto));
    }

    @Test
    void cadastrarTutor() {
        //ARRANGE
        given(repository.existsByTelefoneOrEmail(dto.telefone(), dto.email())).willReturn(false);

        //ACT + ASSERT
        assertDoesNotThrow(() -> service.cadastrar(dto));
        then(repository).should().save(new Tutor(dto));
    }

    @Test
    void atualizarDadosTutor() {
        //ARRANGE
        given(repository.getReferenceById(atualizacaoTutorDto.id())).willReturn(tutor);

        //ACT
        service.atualizar(atualizacaoTutorDto);

        //ASSERT
        then(tutor).should().atualizarDados(atualizacaoTutorDto);
    }

}