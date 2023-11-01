public class Livro {

    private int id;
    private String nome;

    public Livro(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String toString() {
        return "Livro [id: " + id + ", nome: " + nome + "]";
    }
}
