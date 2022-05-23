package construtores.sobrecarga.encapsulamento.application;
import construtores.sobrecarga.encapsulamento.entities.Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program programa;

        System.out.print("Número da conta:");
        int conta = sc.nextInt();
        System.out.print("Nome do titular:");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Deseja fazer um depósito?");
        char iniciar = sc.next().charAt(0);
        if (iniciar == 's'){
            System.out.println("Valor do depósito inicial: ");
            double deposito = sc.nextDouble();
            programa = new Program(conta, nome, deposito);
        }
        else {
            programa = new Program(conta, nome);
        }
        System.out.println();
        System.out.println("Dados da Conta:");
        System.out.println(programa);

        System.out.println();
        System.out.println("Valor do deposito: ");
        double aumento = sc.nextDouble();
        programa.deposito(aumento);
        System.out.println("Dados da conta atualizado:");
        System.out.println(programa);

        System.out.println();
        System.out.println("Valor do saque:");
        double saque = sc.nextDouble();
        programa.saque(saque);
        System.out.println("Dados da conta atualizado:");
        System.out.println(programa);




        sc.close();
    }
}
