package br.com.amanda.gerenciador_pedidos.service;

import br.com.amanda.gerenciador_pedidos.model.Pedido;
import br.com.amanda.gerenciador_pedidos.model.Produto;
import br.com.amanda.gerenciador_pedidos.repository.CategoriaRepository;
import br.com.amanda.gerenciador_pedidos.repository.PedidoRepository;
import br.com.amanda.gerenciador_pedidos.repository.ProdutoRepository;
import br.com.amanda.gerenciador_pedidos.model.Categoria;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class ConsultaService {

    private final ProdutoRepository produtoRepository;
    private final PedidoRepository pedidoRepository;
    private final CategoriaRepository categoriaRepository;

    public ConsultaService(ProdutoRepository produtoRepository,
                           PedidoRepository pedidoRepository,
                           CategoriaRepository categoriaRepository) {
        this.produtoRepository = produtoRepository;
        this.pedidoRepository = pedidoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    // ---------- produtos ----------

    public List<Produto> listarProdutos() {
        return produtoRepository.buscarOrdenadoPorPrecoAsc();
    }

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public List<Produto> produtosPorCategoria(String nomeCategoria) {
        return produtoRepository.findByCategoriaNomeIgnoreCase(nomeCategoria);
    }

    public List<Produto> produtosPorTrecho(String termo) {
        return produtoRepository.findByNomeContainingIgnoreCase(termo);
    }

    public List<Produto> produtosPorLetraInicial(String letra) {
        return produtoRepository.buscarProdutosPorLetraInicial(letra);
    }

    public List<Produto> produtosAcimaDe(Double preco) {
        return produtoRepository.buscarPorPrecoMaior(preco);
    }

    public List<Produto> top3MaisCaros() {
        return produtoRepository.findTop3ByOrderByPrecoDesc();
    }

    public List<Produto> top5MaisCarosComSqlNativo() {
        return produtoRepository.buscarTop5ProdutosMaisCaros();
    }

    public Double mediaDosPrecos() {
        Double media = produtoRepository.calcularMediaPrecoProdutos();
        return media != null ? media : 0.0;   // AVG devolve null quando não há produtos
    }

    public Double precoMaximoDaCategoria(String nomeCategoria) {
        Double maximo = produtoRepository.buscarPrecoMaximoPorCategoria(nomeCategoria);
        return maximo != null ? maximo : 0.0;
    }

    /**
     * A consulta agrupada devolve List<Object[]>, cada posição do array é uma coluna projetada.
     * Aqui os arrays viram um Map com nome da categoria e quantidade.
     */
    public Map<String, Long> quantidadeDeProdutosPorCategoria() {
        Map<String, Long> resultado = new LinkedHashMap<>();
        produtoRepository.contarProdutosPorCategoria()
                .forEach(linha -> resultado.put((String) linha[0], (Long) linha[1]));
        return resultado;
    }

    // ---------- pedidos ----------

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public List<Pedido> pedidosPendentes() {
        return pedidoRepository.findByDataEntregaIsNull();
    }

    public List<Pedido> pedidosEntregues() {
        return pedidoRepository.findByDataEntregaIsNotNull();
    }

    public List<Pedido> pedidosPorPeriodo(LocalDate inicio, LocalDate fim) {
        return pedidoRepository.buscarPedidosPorPeriodo(inicio, fim);
    }
}
