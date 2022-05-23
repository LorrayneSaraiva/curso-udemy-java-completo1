package arrays.listas.entities;

public class Funcionario {
    private String nome;
    private Double salario;
    private Integer id;

    //construtor
    public Funcionario() {
    }
    public Funcionario(Integer id,String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void aumento(double porcentual){
        salario += salario * porcentual / 100.0;
    }
    @Override // ajuda a não errar, caso por exemplo, eu coloque toStrig
    public String toString(){
        return id
                + ", "
                + nome
                + ", "
                + String.format("%.2f", salario);
    }

}
