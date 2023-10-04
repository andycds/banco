import java.sql.DriverManager;
import java.sql.Connection;
public class TesteConexao{
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection(
                //essa é a conhecida string de conexão
                "jdbc:mysql://localhost:3306/aluno", //use o seu banco
                "root",
                "root" //use a sua senha!
            );
            if (conexao != null) {
                System.out.println("Conexão estabelecida com sucesso!");
            } else {
                System.out.println("Conexão não estabelecida!");
            }
        } catch (Exception e){
            System.out.println("Exceção: " + e.getMessage());
        }
    }
}