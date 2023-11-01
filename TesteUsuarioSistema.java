import java.util.List;

public class TesteUsuarioSistema {
    public static void main(String[] args) {
        UsuarioSistemaDAO usuarioDAO = new UsuarioSistemaDAO();
        List<UsuarioSistema> lista;
        lista = usuarioDAO.listar();
        lista.forEach(u -> System.out.println(u));

        UsuarioSistema novo = new UsuarioSistema("novo", "nova", false);
        usuarioDAO.criar(novo);

        novo.setSuperusuario(true);
        System.out.println("------------");
        lista = usuarioDAO.listar();
        lista.forEach(u -> System.out.println(u));
        System.out.println("------------");
        usuarioDAO.atualizar(novo);

        UsuarioSistema doBanco = usuarioDAO.obter("novo", "nova");

        System.out.println(doBanco.isSuperusuario());

        UsuarioSistema naoExiste = usuarioDAO.obter("xxxx", "yyyy");

        if (naoExiste == null) {
            System.out.println("Tudo certo, não trouxe usuário que não existe");
        }

        usuarioDAO.apagar(novo);
        lista = usuarioDAO.listar();
        lista.forEach(u -> System.out.println(u));

    }
}
