package br.com.amanda.model;

public record EnderecoViaCep(String cep, String logradouro,
                             String bairro, String localidade,
                             String estado, String uf,
                             String regiao, String ddd) {
}
