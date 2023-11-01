import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MediaLivroDAO {
    public List<MediaLivro> obterNotas() {
        Conexao conexao = new Conexao();
        String sql = "select nome, avg(nota) from livro l join nota n on l.id = n.  id_livro group by (n.id_livro);";
        PreparedStatement ps;
        List<MediaLivro> lista = new ArrayList<>();
        try {
            ps = conexao.obterConexao().prepareStatement(sql);
            ResultSet medias = ps.executeQuery();
            while (medias.next()) {
                MediaLivro media = new MediaLivro(medias.getString(1), medias.getDouble(2));
                lista.add(media);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lista;
    }
}
