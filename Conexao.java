import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    Connection conexao = null;

    public Connection obterConexao() {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection(
                        // essa é a conhecida string de conexão
                        "jdbc:mysql://localhost:3306/biblioteca",
                        "alunos",
                        "alunos");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conexao;
    }
}
