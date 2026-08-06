package dao;

import model.Categoria;
import model.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Data Access Object
public class ProdutoDAO {
    private Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvar(Produto produto) throws SQLException {
        try (PreparedStatement pstm = connection.prepareStatement(
                "INSERT INTO Produto (nome, descricao) VALUES (?, ?)",
                Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.execute();
            //con.commit();

            try (ResultSet rst = pstm.getGeneratedKeys()) {
                while(rst.next()) {
                    produto.setId(rst.getInt(1));
                }
            }

        }
    }

    public List<Produto> listar() throws SQLException {
        List<Produto> produtos = new ArrayList<>();

        try (PreparedStatement pstm = connection.prepareStatement("SELECT id, nome, descricao FROM Produto")) {
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()) {
                while(rst.next()) {
                    Produto produto = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3));
                    produtos.add(produto);
                }
            }
        }

        return produtos;
    }

//    public List<Produto> buscar(Categoria c) throws SQLException {
//        System.out.println("buscarProdutoDAO");
//        List<Produto> produtos = new ArrayList<>();
//
//        try (PreparedStatement pstm = connection.prepareStatement("SELECT id, nome, descricao FROM Produto WHERE categoria_id = ?")) {
//            pstm.setInt(1, c.getId());
//            pstm.execute();
//
//            try (ResultSet rst = pstm.getResultSet()) {
//                while(rst.next()) {
//                    Produto produto = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3));
//                    produtos.add(produto);
//                }
//            }
//        }
//
//        return produtos;
//    }
}
