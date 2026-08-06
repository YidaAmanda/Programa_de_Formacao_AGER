import java.sql.*;

public class TestaInsercaoComParametro {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection con = factory.recuperarConexao()) {
            con.setAutoCommit(false);

            try (PreparedStatement stm = con.prepareStatement(
                    "INSERT INTO Produto (nome, descricao) VALUES (?, ?)",
                    Statement.RETURN_GENERATED_KEYS);) {

                adicionarVariavel("SmartTV", "45 polegadas", stm);
                adicionarVariavel("Radio", "Sem antena", stm);
                con.commit();
            } catch (Exception e) {
                e.printStackTrace();
                con.rollback();
                System.out.println("rollback executado");
            }
        }
    }

    private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);
        stm.execute();

        try (ResultSet rst = stm.getGeneratedKeys();) {
            while(rst.next()) {
                Integer id = rst.getInt(1);
                System.out.println("O id criado foi:" + id);
            }
        }
    }
}
