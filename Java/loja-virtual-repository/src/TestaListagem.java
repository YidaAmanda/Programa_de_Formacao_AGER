import java.sql.*;

public class TestaListagem {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection con = connectionFactory.recuperarConexao();

        PreparedStatement stm = con.prepareStatement("SELECT id, nome, descricao FROM Produto");
        if(stm.execute()){
            ResultSet rst = stm.getResultSet();

            while(rst.next()) {
                Integer id = rst.getInt("id");
                String nome = rst.getString("nome");
                String descricao = rst.getString("descricao");

                System.out.printf("\n| %d | %s | %s |", id, nome, descricao);
            }
        }
        con.close();
    }
}
