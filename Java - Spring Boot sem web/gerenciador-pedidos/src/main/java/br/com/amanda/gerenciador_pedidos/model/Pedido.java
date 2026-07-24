package br.com.amanda.gerenciador_pedidos.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataPedido;
    private LocalDate dataEntrega;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "pedido_produto",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produtos = new ArrayList<>();

    public Pedido(){}

    public Pedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Double getTotal() {
        return produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();
    }

    @Override
    public String toString() {
        List<String> nomes = produtos.stream()
                .map(Produto::getNome)
                .toList();
        return String.format("Pedido %d | feito em %s | entrega: %s | total: R$ %.2f%n\tprodutos: %s",
                id,
                dataPedido,
                dataEntrega != null ? dataEntrega : "pendente",
                getTotal(),
                nomes);
    }
}
