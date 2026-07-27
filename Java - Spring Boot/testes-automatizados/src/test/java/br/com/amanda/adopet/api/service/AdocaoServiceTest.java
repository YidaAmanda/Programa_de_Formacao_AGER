package br.com.amanda.adopet.api.service;

import br.com.amanda.adopet.api.dto.AprovacaoAdocaoDto;
import br.com.amanda.adopet.api.dto.ReprovacaoAdocaoDto;
import br.com.amanda.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.amanda.adopet.api.model.*;
import br.com.amanda.adopet.api.repository.AdocaoRepository;
import br.com.amanda.adopet.api.repository.PetRepository;
import br.com.amanda.adopet.api.repository.TutorRepository;
import br.com.amanda.adopet.api.validacoes.ValidacaoSolicitacaoAdocao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class AdocaoServiceTest {
    @Mock
    private AprovacaoAdocaoDto aprovacaoAdocaoDto;
    @Mock
    private ReprovacaoAdocaoDto reprovacaoAdocaoDto;
    @Mock
    private AdocaoRepository repository;
    @Mock
    private PetRepository petRepository;
    @Mock
    private TutorRepository tutorRepository;
    @Mock
    private EmailService emailService;
    @Mock
    private Pet pet;
    @Mock
    private Tutor tutor;
    @Mock
    private Abrigo abrigo;
    @Mock
    private ValidacaoSolicitacaoAdocao validador1;
    @Mock
    private ValidacaoSolicitacaoAdocao validador2;

    @Spy
    private List<ValidacaoSolicitacaoAdocao> validacoes = new ArrayList<>();
    @Spy
    private Adocao adocao;

    @InjectMocks
    private AdocaoService service;

    @Captor
    private ArgumentCaptor<Adocao> adocaoCaptor;

    private SolicitacaoAdocaoDto dto;

    @Test
    @DisplayName("Salva adocao após solicitação")
    void salvarAdocaoCenario1() {
        //ARRANGE
        this.dto = new SolicitacaoAdocaoDto(10l, 20l, "motivo qualquer");
        given(petRepository.getReferenceById(dto.idPet())).willReturn(pet);
        given(tutorRepository.getReferenceById(dto.idTutor())).willReturn(tutor);
        given(pet.getAbrigo()).willReturn(abrigo);

        //ACT
        service.solicitar(dto);

        //ASSERT
        then(repository).should().save(adocaoCaptor.capture());
        Adocao adocaoSalta = adocaoCaptor.getValue();
        Assertions.assertEquals(pet, adocaoSalta.getPet());
        Assertions.assertEquals(tutor, adocaoSalta.getTutor());
        Assertions.assertEquals(dto.motivo(), adocaoSalta.getMotivo());
    }

    @Test
    @DisplayName("Chama validarores de adocao ao solicitar")
    void chamaValidadoresCenario1() {
        //ARRANGE
        this.dto = new SolicitacaoAdocaoDto(10l, 20l, "motivo qualquer");
        given(petRepository.getReferenceById(dto.idPet())).willReturn(pet);
        given(tutorRepository.getReferenceById(dto.idTutor())).willReturn(tutor);
        given(pet.getAbrigo()).willReturn(abrigo);
        validacoes.add(validador1);
        validacoes.add(validador2);

        //ACT
        service.solicitar(dto);

        //ASSERT
        BDDMockito.then(validador1).should().validar(dto);
        BDDMockito.then(validador2).should().validar(dto);
    }

    @Test
    void enviarEmailAoSolicitarAdocao() {

        //ARRANGE
        SolicitacaoAdocaoDto dto = new SolicitacaoAdocaoDto(10l, 30l, "motivo teste");
        given(petRepository.getReferenceById(dto.idPet())).willReturn(pet);
        given(tutorRepository.getReferenceById(dto.idTutor())).willReturn(tutor);
        given(pet.getAbrigo()).willReturn(abrigo);

        //ACT
        service.solicitar(dto);

        //ASSERT
        then(repository).should().save(adocaoCaptor.capture());
        Adocao adocao = adocaoCaptor.getValue();
        then(emailService).should().enviarEmail(
                adocao.getPet().getAbrigo().getEmail(),
                "Solicitação de adoção",
                "Olá " +adocao.getPet().getAbrigo().getNome() +"!\n\nUma solicitação de adoção foi registrada hoje para o pet: " +adocao.getPet().getNome() +". \nFavor avaliar para aprovação ou reprovação."
        );
    }

    @Test
    void aprovarAdocao(){

        //ARRANGE
        given(repository.getReferenceById(aprovacaoAdocaoDto.idAdocao())).willReturn(adocao);
        given(adocao.getPet()).willReturn(pet);
        given(pet.getAbrigo()).willReturn(abrigo);
        given(abrigo.getEmail()).willReturn("email@example.com");
        given(adocao.getTutor()).willReturn(tutor);
        given(tutor.getNome()).willReturn("Rodrigo");
        given(adocao.getData()).willReturn(LocalDateTime.now());


        //ACT
        service.aprovar(aprovacaoAdocaoDto);


        //ASSERT
        then(adocao).should().marcarComoAprovada();
        assertEquals(StatusAdocao.APROVADO, adocao.getStatus());
    }

    @Test
    void enviarEmailAoAprovarUmaAdocao(){

        //ARRANGE
        given(repository.getReferenceById(aprovacaoAdocaoDto.idAdocao())).willReturn(adocao);
        given(adocao.getPet()).willReturn(pet);
        given(pet.getAbrigo()).willReturn(abrigo);
        given(abrigo.getEmail()).willReturn("email@example.com");
        given(adocao.getTutor()).willReturn(tutor);
        given(tutor.getNome()).willReturn("Rodrigo");
        given(adocao.getData()).willReturn(LocalDateTime.now());

        //ACT
        service.aprovar(aprovacaoAdocaoDto);

        //ASSERT
        then(emailService).should().enviarEmail(
                adocao.getPet().getAbrigo().getEmail(),
                "Adoção aprovada",
                "Parabéns " +adocao.getTutor().getNome() +"!\n\nSua adoção do pet " +adocao.getPet().getNome() +", solicitada em " +adocao.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) +", foi aprovada.\nFavor entrar em contato com o abrigo " +adocao.getPet().getAbrigo().getNome() +" para agendar a busca do seu pet."
        );
    }


    @Test
    void reprovarUmaAdocao(){
        //ARRANGE
        given(repository.getReferenceById(aprovacaoAdocaoDto.idAdocao())).willReturn(adocao);
        given(adocao.getPet()).willReturn(pet);
        given(pet.getAbrigo()).willReturn(abrigo);
        given(abrigo.getEmail()).willReturn("email@example.com");
        given(adocao.getTutor()).willReturn(tutor);
        given(tutor.getNome()).willReturn("Rodrigo");
        given(adocao.getData()).willReturn(LocalDateTime.now());

        //ACT
        service.reprovar(reprovacaoAdocaoDto);


        //ASSERT
        then(adocao).should().marcarComoReprovada(reprovacaoAdocaoDto.justificativa());
        assertEquals(StatusAdocao.REPROVADO,adocao.getStatus());
    }

    @Test
    void enviarEmailAoReprovarUmaAdocao(){
        //ARRANGE
        given(repository.getReferenceById(aprovacaoAdocaoDto.idAdocao())).willReturn(adocao);
        given(adocao.getPet()).willReturn(pet);
        given(pet.getAbrigo()).willReturn(abrigo);
        given(abrigo.getEmail()).willReturn("email@example.com");
        given(adocao.getTutor()).willReturn(tutor);
        given(tutor.getNome()).willReturn("Rodrigo");
        given(adocao.getData()).willReturn(LocalDateTime.now());

        //ACT
        service.reprovar(reprovacaoAdocaoDto);

        //ASSERT
        then(emailService).should().enviarEmail(
                adocao.getPet().getAbrigo().getEmail(),
                "Solicitação de adoção",
                "Olá " +adocao.getTutor().getNome() +"!\n\nInfelizmente sua adoção do pet " +adocao.getPet().getNome() +", solicitada em " +adocao.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) +", foi reprovada pelo abrigo " +adocao.getPet().getAbrigo().getNome() +" com a seguinte justificativa: " +adocao.getJustificativaStatus()
        );
    }
}