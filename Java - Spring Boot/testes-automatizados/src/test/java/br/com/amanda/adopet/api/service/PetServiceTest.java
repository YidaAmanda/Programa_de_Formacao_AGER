package br.com.amanda.adopet.api.service;

import br.com.amanda.adopet.api.dto.CadastroPetDto;
import br.com.amanda.adopet.api.model.Abrigo;
import br.com.amanda.adopet.api.model.Pet;
import br.com.amanda.adopet.api.repository.PetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class PetServiceTest {
    @Mock
    private CadastroPetDto cadastroPetDto;
    @Mock
    private PetRepository repository;
    @Mock
    private Abrigo abrigo;

    @InjectMocks
    private PetService service;

    @Test
    void cadastrarPet() {
        //ACT
        service.cadastrarPet(abrigo,cadastroPetDto);

        //ASSERT
        then(repository).should().save(new Pet(cadastroPetDto,abrigo));
    }

    @Test
    void retornarTodosOsPetsDisponiveis() {
        //ACT
        service.buscarPetsDisponiveis();

        //ASSERT
        then(repository).should().findAllByAdotadoFalse();
    }

}