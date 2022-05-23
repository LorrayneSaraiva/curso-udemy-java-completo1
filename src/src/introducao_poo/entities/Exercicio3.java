package src.introducao_poo.entities;

public class Exercicio3 {
    public String nome;
    public double nota1, nota2, nota3;


    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }
    public double aprovacao(){
        if ((notaFinal() > 60.0)){
            return 0.0;
        }
        else {
            return 60.0 - notaFinal();
        }
    }
}
