//Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
//uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
//que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
//para ser responsável pelos cálculos.
package src.introducao_poo.application;

import src.introducao_poo.entities.MembrosEstaticos1;

import java.util.Scanner;

public class MEstaticosMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double cotacao = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double dolares = sc.nextDouble();
        double resultado = MembrosEstaticos1.reaisPagar(cotacao, dolares);
        System.out.printf("Amount to be paid in reais = %.2f\n", resultado);

        sc.close();
    }
}
