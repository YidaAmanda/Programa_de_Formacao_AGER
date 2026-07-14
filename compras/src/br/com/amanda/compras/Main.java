package br.com.amanda.compras;

import br.com.amanda.compras.model.Cartao;
import br.com.amanda.compras.model.Produto;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu limite: ");
        double limite = scanner.nextDouble();
        Cartao cartao = new Cartao(limite);

        int sair;
        do {
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.next();

            System.out.print("Digite o preco do produto: ");
            double preco = scanner.nextDouble();

            Produto produto = new Produto(nome, preco);
            if (cartao.comprar(produto)) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou outro numero para continuar");
                sair = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!\nLista de compras:");
                Collections.sort(cartao.getCompras());
                for (Produto compra : cartao.getCompras()) {
                    System.out.println(compra);
                }
                System.out.println("\nSaldo atual: " + cartao.getSaldo());
                System.out.print("Digite 0 para sair ou outro numero para continuar: ");
                sair = scanner.nextInt();
            }
        } while(sair != 0);
    }
}
