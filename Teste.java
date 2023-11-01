import java.util.List;

public class Teste {
    public static void main(String[] args) {
        MediaLivroDAO mediaLivroDAO = new MediaLivroDAO();
        List<MediaLivro> lista = mediaLivroDAO.obterNotas();
        lista.forEach(System.out::println);
    }
}
