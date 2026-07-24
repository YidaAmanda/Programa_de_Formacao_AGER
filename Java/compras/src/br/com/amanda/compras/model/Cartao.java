package br.com.amanda.compras.model;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limite;
    private double saldo;
    private List<Produto> compras;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produto> getCompras() {
        return compras;
    }

    public boolean comprar (Produto produto) {
        if (this.saldo > produto.getPreco()) {
            this.saldo -= produto.getPreco();
            this.compras.add(produto);
            return true;
        }

        return false;
    }
}
