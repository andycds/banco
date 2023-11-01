import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TesteGrafico {

    JFrame f;

    TesteGrafico() {
        f = new JFrame("Nota dos Livros");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MediaLivroDAO mediaLivroDAO = new MediaLivroDAO();
        List<MediaLivro> lista = mediaLivroDAO.obterNotas();
        String data[][] = new String[lista.size()][];
        for (int i = 0; i < lista.size(); i++) {
            data[i] = lista.get(i).toArray();
        }
        // lista.forEach(System.out::println);
        // String data[][] = { { "101", "Amit", "670000" },
        // { "102", "Jai", "780000" },
        // { "101", "Sachin", "700000" } };
        String column[] = { "LIVRO", "MÉDIA" };
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TesteGrafico();
    }
}