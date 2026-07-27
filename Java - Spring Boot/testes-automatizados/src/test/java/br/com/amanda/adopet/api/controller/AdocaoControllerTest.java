package br.com.amanda.adopet.api.controller;

import br.com.amanda.adopet.api.service.AdocaoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;


@SpringBootTest
@AutoConfigureMockMvc
class AdocaoControllerTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private AdocaoService service;

    @Test
    @DisplayName("Devolve código 400 para solicitação de adoção com erros")
    void solicitarAdocaoComErrosCenario1() throws Exception {
        //ARRANGE
        String json = "{}";

        //ACT
        MockHttpServletResponse response = mvc.perform(
                post("/adocoes")
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //ASSERT
        Assertions.assertEquals(400, response.getStatus());
    }

    @Test
    @DisplayName("Devolve código 200 para solicitação de adoção sem erros")
    void solicitarAdocaoSemErrosCenario1() throws Exception {
        //ARRANGE
        String json = """
            {
                "idPet": 1,
                "idTutor": 1,
                "motivo": "Motivo qualquer"
            }
            """;

        //ACT
        MockHttpServletResponse response = mvc.perform(
                post("/adocoes")
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //ASSERT
        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void devolverCodigo200ParaRequisicaoDeAprovarAdocao() throws Exception {
        //ARRANGE
        String json = """
                {
                    "idAdocao": 1
                }
                """;

        //ACT
        MockHttpServletResponse response = mvc.perform(
                put("/adocoes/aprovar")
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //ASSERT
        assertEquals(200,response.getStatus());
    }

    @Test
    void devolverCodigo400ParaRequisicaoDeAprovarAdocaoInvalida() throws Exception{
        //ARRANGE
        String json = """
                {
                    
                }
                """;

        //ACT
        MockHttpServletResponse response = mvc.perform(
                put("/adocoes/aprovar")
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //ASSERT
        assertEquals(400,response.getStatus());
    }

    @Test
    void devolverCodigo200ParaRequisicaoDeReprovarAdocao() throws Exception {
        //ARRANGE
        String json = """
                {
                    "idAdocao": 1,
                    "justificativa": "qualquer"
                }
                """;

        //ACT
        MockHttpServletResponse response = mvc.perform(
                put("/adocoes/reprovar")
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //ASSERT
        assertEquals(200,response.getStatus());
    }

    @Test
    void devolverCodigo400ParaRequisicaoDeReprovarAdocaoInvalido() throws Exception{
        //ARRANGE
        String json = """
                {

                }
                """;

        //ACT
        MockHttpServletResponse response = mvc.perform(
                put("/adocoes/reprovar")
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andReturn().getResponse();

        //ASSERT
        assertEquals(400,response.getStatus());
    }
}