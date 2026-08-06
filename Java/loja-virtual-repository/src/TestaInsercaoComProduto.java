import dao.ProdutoDAO;
import model.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaInsercaoComProduto {
    public static void main(String[] args) throws SQLException {
        Produto produto = new Produto("Celular", "iPhone");

        try (Connection con = new ConnectionFactory().recuperarConexao()) {
            ProdutoDAO produtoDAO = new ProdutoDAO(con);
            produtoDAO.salvar(produto);
            List<Produto> produtos = produtoDAO.listar();
            produtos.stream().forEach(System.out::println);
        }

    }
}
