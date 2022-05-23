package src.introducao_poo.entities;

public class Exercicio2 {
    public String nome;
    public double salario_bruto, imposto;

    public double SalarioLiquido(){
        return this.salario_bruto - this.imposto;
    }
    public void aumento(double porcentual){
        //this.salario_bruto *= porcentual;
        this.salario_bruto += this.salario_bruto * porcentual / 100.0;
    }
    public String toString(){
        return nome
                + ", R$ "
                + String.format("%.2f", SalarioLiquido());
    }




}
