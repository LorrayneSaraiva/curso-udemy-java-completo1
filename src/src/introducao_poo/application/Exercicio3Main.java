//Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
//(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
//ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
//para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
//resolver este problema
package src.introducao_poo.application;

import src.introducao_poo.entities.Exercicio3;

import java.util.Scanner;

public class Exercicio3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //instância
        Exercicio3 students = new Exercicio3();

        students.nome  = sc.nextLine();
        students.nota1 = sc.nextDouble();
        students.nota2 = sc.nextDouble();
        students.nota3 = sc.nextDouble();

        System.out.printf("Nota Final = %.2f\n", students.notaFinal());
        if (students.notaFinal() > 60.00){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("Missing %.2f Points", students.aprovacao());
        }
        sc.close();
    }
}
