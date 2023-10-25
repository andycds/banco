import java.util.List;

public class TesteUsuario {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> lista;
        lista = usuarioDAO.listar();
        lista.forEach(u -> System.out.println(u));

        Usuario novo = new Usuario("novo", "nova", false);
        usuarioDAO.criar(novo);

        novo.setSuperusuario(true);
        System.out.println("------------");
        lista = usuarioDAO.listar();
        lista.forEach(u -> System.out.println(u));
        System.out.println("------------");
        usuarioDAO.atualizar(novo);

        Usuario doBanco = usuarioDAO.obter("novo", "nova");

        System.out.println(doBanco.isSuperusuario());

        Usuario naoExiste = usuarioDAO.obter("xxxx", "yyyy");

        if (naoExiste == null) {
            System.out.println("Tudo certo, não trouxe usuário que não existe");
        }

        usuarioDAO.apagar(novo);
        lista = usuarioDAO.listar();
        lista.forEach(u -> System.out.println(u));

    }
}
