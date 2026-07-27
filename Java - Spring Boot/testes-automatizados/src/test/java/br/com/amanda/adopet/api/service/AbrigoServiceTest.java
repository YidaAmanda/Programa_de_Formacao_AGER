package br.com.amanda.adopet.api.service;

import br.com.amanda.adopet.api.model.Abrigo;
import br.com.amanda.adopet.api.repository.AbrigoRepository;
import br.com.amanda.adopet.api.repository.PetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class AbrigoServiceTest {
    @Mock
    private AbrigoRepository repository;
    @Mock
    private Abrigo abrigo;
    @Mock
    private PetRepository petRepository;

    @InjectMocks
    private AbrigoService service;

    @Test
    void chamarListaDeTodosOsAbrigos() {
        //ACT
        service.listar();

        //ASSERT
        then(repository).should().findAll();
    }

    @Test
    void chamarListaDePetsDoAbrigoAtravesDoNome() {
        //ARRANGE
        String nome = "Miau";
        given(repository.findByNome(nome)).willReturn(Optional.of(abrigo));

        //ACT
        service.listarPetsDoAbrigo(nome);

        //ASSERT
        then(petRepository).should().findByAbrigo(abrigo);
    }

}