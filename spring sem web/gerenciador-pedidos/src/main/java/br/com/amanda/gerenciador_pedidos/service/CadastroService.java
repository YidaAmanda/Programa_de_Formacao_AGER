package br.com.amanda.gerenciador_pedidos.service;

import br.com.amanda.gerenciador_pedidos.model.Categoria;
import br.com.amanda.gerenciador_pedidos.model.Fornecedor;
import br.com.amanda.gerenciador_pedidos.model.Pedido;
import br.com.amanda.gerenciador_pedidos.model.Produto;
import br.com.amanda.gerenciador_pedidos.repository.CategoriaRepository;
import br.com.amanda.gerenciador_pedidos.repository.FornecedorRepository;
import br.com.amanda.gerenciador_pedidos.repository.PedidoRepository;
import br.com.amanda.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CadastroService {

    private final CategoriaRepository categoriaRepository;
    private final FornecedorRepository fornecedorRepository;
    private final ProdutoRepository produtoRepository;
    private final PedidoRepository pedidoRepository;

    public CadastroService(CategoriaRepository categoriaRepository,
                           FornecedorRepository fornecedorRepository,
                           ProdutoRepository produtoRepository,
                           PedidoRepository pedidoRepository) {
        this.categoriaRepository = categoriaRepository;
        this.fornecedorRepository = fornecedorRepository;
        this.produtoRepository = produtoRepository;
        this.pedidoRepository = pedidoRepository;
    }

    public Categoria cadastrarCategoria(String nome) {
        return categoriaRepository.findByNomeIgnoreCase(nome)
                .orElseGet(() -> categoriaRepository.save(new Categoria(nome)));
    }

    public Fornecedor cadastrarFornecedor(String nome) {
        return fornecedorRepository.findByNomeIgnoreCase(nome)
                .orElseGet(() -> fornecedorRepository.save(new Fornecedor(nome)));
    }

    public Produto cadastrarProduto(String nome, Double preco, String nomeCategoria, String nomeFornecedor) {
        if (produtoRepository.findByNomeIgnoreCase(nome).isPresent()) {
            throw new IllegalArgumentException("Já existe um produto chamado " + nome);
        }

        Produto produto = new Produto(nome, preco, cadastrarCategoria(nomeCategoria));
        produto.setFornecedor(cadastrarFornecedor(nomeFornecedor));
        return produtoRepository.save(produto);
    }

    public Pedido criarPedido(List<String> nomesProdutos) {
        List<Produto> produtos = new ArrayList<>();

        for (String nome : nomesProdutos) {
            Optional<Produto> produto = produtoRepository.findByNomeIgnoreCase(nome);
            if (produto.isEmpty()) {
                throw new IllegalArgumentException("Produto não cadastrado: " + nome);
            }
            produtos.add(produto.get());
        }

        if (produtos.isEmpty()) {
            throw new IllegalArgumentException("Um pedido precisa de pelo menos um produto");
        }

        Pedido pedido = new Pedido(LocalDate.now());
        pedido.setProdutos(produtos);
        return pedidoRepository.save(pedido);
    }

    public Pedido registrarEntrega(Long idPedido, LocalDate dataEntrega) {
        Pedido pedido = pedidoRepository.findById(idPedido)
                .orElseThrow(() -> new IllegalArgumentException("Pedido " + idPedido + " não encontrado"));

        if (dataEntrega.isBefore(pedido.getDataPedido())) {
            throw new IllegalArgumentException("A entrega não pode ser anterior à data do pedido");
        }

        pedido.setDataEntrega(dataEntrega);
        return pedidoRepository.save(pedido);
    }

    /**
     * Popula o banco com dados de exemplo. Só cadastra o que ainda não existe,
     * então pode rodar quantas vezes quiser sem violar a restrição de nome único.
     */
    public void popularDadosDeExemplo() {
        cadastrarSeNaoExistir("Notebook", 3500.0, "Eletrônicos", "Tech Supplier");
        cadastrarSeNaoExistir("Smartphone", 2500.0, "Eletrônicos", "Tech Supplier");
        cadastrarSeNaoExistir("Fone de ouvido", 250.0, "Eletrônicos", "Tech Supplier");
        cadastrarSeNaoExistir("Livro de Java", 100.0, "Livros", "Livraria Global");
        cadastrarSeNaoExistir("Livro de SQL", 90.0, "Livros", "Livraria Global");

        if (pedidoRepository.count() == 0) {
            criarPedido(List.of("Notebook", "Livro de Java"));
            registrarEntrega(criarPedido(List.of("Smartphone")).getId(), LocalDate.now());
        }
    }

    private void cadastrarSeNaoExistir(String nome, Double preco, String categoria, String fornecedor) {
        if (produtoRepository.findByNomeIgnoreCase(nome).isEmpty()) {
            cadastrarProduto(nome, preco, categoria, fornecedor);
        }
    }
}
