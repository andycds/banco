import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection(
                    // essa é a conhecida string de conexão
                    "jdbc:mysql://localhost:3306/aluno", // use o seu banco
                    "alunos",
                    "alunos" // use a sua senha!
            );
            if (conexao != null) {
                String usuario = JOptionPane.showInputDialog("Usuário?");
                String senha = JOptionPane.showInputDialog("Senha?");
                System.out.println("Conexão estabelecida com sucesso!");
                String sql = "SELECT * FROM usuario WHERE login = ? AND SENHA = ?;";
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setString(1, usuario);
                ps.setString(2, senha);
                ResultSet resultado = ps.executeQuery();
                if (resultado.next()) {
                    String user = resultado.getString(1);
                    String pass = resultado.getString(2);
                    Boolean superusuario = resultado.getBoolean(3);
                    JOptionPane.showMessageDialog(null, "Usuário e senha validados: " + user + " / " + pass
                            + " é um superusuário? " + superusuario);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos, tente novamente");
                }
                conexao.close();
            } else {
                System.out.println("Conexão não estabelecida!");
            }
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
        }
    }
}