package arrays.listas;

public class Vetor1 {
    private String nome;
    private String email;

    public Vetor1() {
    }
    public Vetor1(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String toString() {
        return nome + ", " + email;
    }
}
