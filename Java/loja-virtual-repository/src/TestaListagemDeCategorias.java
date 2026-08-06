import dao.CategoriaDAO;
import dao.ProdutoDAO;
import model.Categoria;
import model.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaListagemDeCategorias {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = new ConnectionFactory().recuperarConexao()) {
            CategoriaDAO categoriaDao = new CategoriaDAO(connection);
            List<Categoria> categorias = categoriaDao.listarComProdutos();
            categorias.stream().forEach(c -> {
                for (Produto produto : c.getProdutos()) {
                    System.out.print(c);
                    System.out.println(produto);
                }

//                try {
//                    for (Produto produto : new ProdutoDAO(connection).buscar(c)) {
//                        System.out.print(c);
//                        System.out.println(produto);
//                    }
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
            });
        }
    }
}
