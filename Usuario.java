public class Usuario {

    private String login;
    private String senha; // Não é uma boa prática, apenas para demonstrar
    private boolean superusuario;

    public Usuario(String login, String senha, boolean superusuario) {
        this.login = login;
        this.senha = senha;
        this.superusuario = superusuario;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isSuperusuario() {
        return superusuario;
    }

    public void setSuperusuario(boolean superusuario) {
        this.superusuario = superusuario;
    }

    public String toString() {
        return "Usuario [login: " + login + ", senha: " + senha + ", superusuario: " + superusuario + "]";
    }
}