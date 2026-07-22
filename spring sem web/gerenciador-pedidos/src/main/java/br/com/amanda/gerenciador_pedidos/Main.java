package br.com.amanda.gerenciador_pedidos;

import br.com.amanda.gerenciador_pedidos.model.Categoria;
import br.com.amanda.gerenciador_pedidos.model.Pedido;
import br.com.amanda.gerenciador_pedidos.model.Produto;
import br.com.amanda.gerenciador_pedidos.service.CadastroService;
import br.com.amanda.gerenciador_pedidos.service.ConsultaService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final CadastroService cadastroService;
    private final ConsultaService consultaService;
    private final Scanner leitura = new Scanner(System.in);
    private final DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Main(CadastroService cadastroService, ConsultaService consultaService) {
        this.cadastroService = cadastroService;
        this.consultaService = consultaService;
    }

    public void exibeMenu() {
        int opcao;
        var menu = """

                ========= GERENCIADOR DE PEDIDOS =========
                --- Cadastros ---
                1  - Cadastrar produto
                2  - Criar pedido
                3  - Registrar entrega de um pedido
                --- Produtos ---
                4  - Listar produtos
                5  - Buscar produtos por categoria
                6  - Buscar produtos por trecho do nome
                7  - Buscar produtos por letra inicial
                8  - Produtos acima de um preço
                9  - Top 3 produtos mais caros
                10 - Top 5 produtos mais caros (SQL nativo)
                11 - Relatório de preços por categoria
                --- Pedidos ---
                12 - Listar pedidos
                13 - Pedidos pendentes de entrega
                14 - Pedidos já entregues
                15 - Pedidos por período
                --- Dados ---
                16 - Popular banco com dados de exemplo

                0  - Sair
                ==========================================

                Escolha:\t""";

        do {
            System.out.print(menu);
            opcao = lerInteiro();

            try {
                switch (opcao) {
                    case 1:
                        cadastrarProduto();
                        break;
                    case 2:
                        criarPedido();
                        break;
                    case 3:
                        registrarEntrega();
                        break;
                    case 4:
                        listarProdutos();
                        break;
                    case 5:
                        buscarProdutosPorCategoria();
                        break;
                    case 6:
                        buscarProdutosPorTrecho();
                        break;
                    case 7:
                        buscarProdutosPorLetraInicial();
                        break;
                    case 8:
                        buscarProdutosAcimaDeUmPreco();
                        break;
                    case 9:
                        listarTop3MaisCaros();
                        break;
                    case 10:
                        listarTop5MaisCarosComSqlNativo();
                        break;
                    case 11:
                        exibirRelatorioDePrecos();
                        break;
                    case 12:
                        listarPedidos();
                        break;
                    case 13:
                        listarPedidosPendentes();
                        break;
                    case 14:
                        listarPedidosEntregues();
                        break;
                    case 15:
                        buscarPedidosPorPeriodo();
                        break;
                    case 16:
                        popularDadosDeExemplo();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Não foi possível concluir: " + ex.getMessage());
            }
        } while (opcao != 0);
    }

    // ---------- cadastros ----------

    private void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = leitura.nextLine();

        System.out.print("Preço: ");
        Double preco = lerDecimal();

        System.out.print("Categoria: ");
        String categoria = leitura.nextLine();

        System.out.print("Fornecedor: ");
        String fornecedor = leitura.nextLine();

        Produto produto = cadastroService.cadastrarProduto(nome, preco, categoria, fornecedor);
        System.out.println("Produto cadastrado: " + produto);
    }

    private void criarPedido() {
        listarProdutos();
        System.out.println("Digite o nome dos produtos do pedido (linha vazia para encerrar):");

        List<String> nomes = new ArrayList<>();
        String nome = leitura.nextLine();
        while (!nome.isBlank()) {
            nomes.add(nome);
            nome = leitura.nextLine();
        }

        Pedido pedido = cadastroService.criarPedido(nomes);
        System.out.println("Pedido criado:");
        System.out.println(pedido);
    }

    private void registrarEntrega() {
        listarPedidosPendentes();
        System.out.print("Id do pedido entregue: ");
        long id = lerInteiro();

        System.out.print("Data da entrega (dd/MM/yyyy, vazio para hoje): ");
        LocalDate data = lerData();

        Pedido pedido = cadastroService.registrarEntrega(id, data);
        System.out.println("Entrega registrada:");
        System.out.println(pedido);
    }

    private void popularDadosDeExemplo() {
        cadastroService.popularDadosDeExemplo();
        System.out.println("Dados de exemplo carregados.");
        listarProdutos();
    }

    // ---------- consultas de produtos ----------

    private void listarProdutos() {
        exibirProdutos(consultaService.listarProdutos());
    }

    private void buscarProdutosPorCategoria() {
        List<Categoria> categorias = consultaService.listarCategorias();
        System.out.println("Categorias cadastradas: " + categorias);

        System.out.print("Categoria: ");
        String categoria = leitura.nextLine();
        exibirProdutos(consultaService.produtosPorCategoria(categoria));
    }

    private void buscarProdutosPorTrecho() {
        System.out.print("Trecho do nome: ");
        String termo = leitura.nextLine();
        exibirProdutos(consultaService.produtosPorTrecho(termo));
    }

    private void buscarProdutosPorLetraInicial() {
        System.out.print("Letra inicial: ");
        String letra = leitura.nextLine();
        exibirProdutos(consultaService.produtosPorLetraInicial(letra));
    }

    private void buscarProdutosAcimaDeUmPreco() {
        System.out.print("Preço mínimo: ");
        Double preco = lerDecimal();
        exibirProdutos(consultaService.produtosAcimaDe(preco));
    }

    private void listarTop3MaisCaros() {
        System.out.println("Top 3 produtos mais caros (derived query):");
        exibirProdutos(consultaService.top3MaisCaros());
    }

    private void listarTop5MaisCarosComSqlNativo() {
        System.out.println("Top 5 produtos mais caros (query nativa):");
        exibirProdutos(consultaService.top5MaisCarosComSqlNativo());
    }

    private void exibirRelatorioDePrecos() {
        System.out.printf("Média de preços: R$ %.2f%n", consultaService.mediaDosPrecos());

        Map<String, Long> porCategoria = consultaService.quantidadeDeProdutosPorCategoria();
        if (porCategoria.isEmpty()) {
            System.out.println("Nenhum produto cadastrado ainda.");
            return;
        }

        System.out.println("Produtos por categoria:");
        porCategoria.forEach((categoria, quantidade) ->
                System.out.printf("\t%s: %d produto(s) | mais caro: R$ %.2f%n",
                        categoria, quantidade, consultaService.precoMaximoDaCategoria(categoria)));
    }

    // ---------- consultas de pedidos ----------

    private void listarPedidos() {
        exibirPedidos(consultaService.listarPedidos());
    }

    private void listarPedidosPendentes() {
        System.out.println("Pedidos pendentes de entrega:");
        exibirPedidos(consultaService.pedidosPendentes());
    }

    private void listarPedidosEntregues() {
        System.out.println("Pedidos já entregues:");
        exibirPedidos(consultaService.pedidosEntregues());
    }

    private void buscarPedidosPorPeriodo() {
        System.out.print("Data inicial (dd/MM/yyyy, vazio para hoje): ");
        LocalDate inicio = lerData();

        System.out.print("Data final (dd/MM/yyyy, vazio para hoje): ");
        LocalDate fim = lerData();

        exibirPedidos(consultaService.pedidosPorPeriodo(inicio, fim));
    }

    // ---------- exibição ----------

    private void exibirProdutos(List<Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
            return;
        }
        produtos.forEach(p -> System.out.println("\t" + p));
    }

    private void exibirPedidos(List<Pedido> pedidos) {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido encontrado.");
            return;
        }
        pedidos.forEach(System.out::println);
    }

    // ---------- leitura ----------

    private int lerInteiro() {
        while (true) {
            try {
                return Integer.parseInt(leitura.nextLine().trim());
            } catch (NumberFormatException ex) {
                System.out.print("Digite um número inteiro: ");
            }
        }
    }

    private Double lerDecimal() {
        while (true) {
            try {
                return Double.parseDouble(leitura.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException ex) {
                System.out.print("Digite um número (ex.: 199.90): ");
            }
        }
    }

    private LocalDate lerData() {
        while (true) {
            String texto = leitura.nextLine().trim();
            if (texto.isBlank()) {
                return LocalDate.now();
            }
            try {
                return LocalDate.parse(texto, formatador);
            } catch (DateTimeParseException ex) {
                System.out.print("Data inválida, use o formato dd/MM/yyyy: ");
            }
        }
    }
}
