package src.introducao_poo.application;

import src.introducao_poo.entities.Exercicio2;
import java.util.Scanner;

public class Exercicio2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Exercicio2 funcionario = new Exercicio2();

        funcionario.nome = sc.nextLine();
        funcionario.salario_bruto = sc.nextDouble();
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.printf("Employee: " +funcionario);

        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double porcentual = sc.nextDouble();
        funcionario.aumento(porcentual);

        System.out.println();
        System.out.println("Update Data: " + funcionario);


        sc.close();
    }
}
