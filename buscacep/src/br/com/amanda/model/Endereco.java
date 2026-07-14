package br.com.amanda.model;

import br.com.amanda.exception.ErroFormatoDDDException;
import br.com.amanda.exception.ErroTamanhoCepException;

public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String uf;
    private String regiao;
    private int ddd;

    public Endereco(EnderecoViaCep enderecoViaCep) {
        this.cep = enderecoViaCep.cep();
        this.logradouro = enderecoViaCep.logradouro();
        this.bairro = enderecoViaCep.Bairro();
        this.cidade = enderecoViaCep.localidade();
        this.estado = enderecoViaCep.estado();
        this.uf = enderecoViaCep.uf();
        this.regiao = enderecoViaCep.regiao();
        if (enderecoViaCep.ddd().length() != 2) {
            throw new ErroTamanhoCepException("O ddd deve conter 2 caracteres!");
        } else if (!enderecoViaCep.ddd().matches("\\d+")) {
            throw new ErroFormatoDDDException("O DDD deve conter apenas números!");
        }
        this.ddd = Integer.valueOf(enderecoViaCep.ddd());
    }

    @Override
    public String toString() {
        return "Endereço(cep: " + cep +
                ", logradouro: " + logradouro +
                ", Bairro: " + bairro +
                ", localidade: " + cidade +
                ", estado: " + estado +
                ", uf: " + uf +
                ", região: " + regiao +
                ", ddd: " + ddd + ")";
    }
}
