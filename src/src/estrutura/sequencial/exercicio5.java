//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
package src.estrutura.sequencial;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo1, numPeca1, codigo2, numPeca2;
        double valorUni1, valorUni2, valorPagar;

        codigo1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valorUni1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorUni2 = sc.nextDouble();

        valorPagar = (numPeca1 * valorUni1) + (numPeca2 * valorUni2);

        System.out.printf("Valor a pagar: R$ %.2f", valorPagar);

        sc.close();
    }
}
