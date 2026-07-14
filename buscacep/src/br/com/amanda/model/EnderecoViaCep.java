package br.com.amanda.model;

public record EnderecoViaCep(String cep, String logradouro,
                             String Bairro, String localidade,
                             String estado, String uf,
                             String regiao, String ddd) {
}
