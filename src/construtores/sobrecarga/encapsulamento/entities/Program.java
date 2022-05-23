package construtores.sobrecarga.encapsulamento.entities;

public class Program {
    private int conta_bancaria;
    private String nome;
    private double saldo; //não vai no construtor

    //sobrecarga
    public Program(int conta_bancaria, String nome) {
        this.conta_bancaria = conta_bancaria;
        this.nome = nome;
    }
    //construtor
    public Program(int conta_bancaria, String nome, double deposito_inicial) {
        this.conta_bancaria = conta_bancaria;
        this.nome = nome;
        deposito(deposito_inicial);
    }
    //encapsulamento
    public void deposito(double quantidade){

        saldo += quantidade;
    }
    public void saque(double quantidade){

        saldo -= quantidade + 5.0;
    }
    public void setNome(String nome) {

        this.nome = nome;
    }
    public int getConta_bancaria() {

        return conta_bancaria;
    }
    public String getNome() {

        return nome;
    }
    public double getSaldo() {

        return saldo;
    }
    public String toString(){
        return "Conta "
                + conta_bancaria
                + ", nome: "
                + nome
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
}
