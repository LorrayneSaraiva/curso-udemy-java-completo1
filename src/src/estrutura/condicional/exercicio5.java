//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
package src.estrutura.condicional;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cachorroQ = 4.0, xSalada = 4.5, xBacon = 5.0,
        torrada = 2.00, refri = 1.5, total = 0;

        int codigo = sc.nextInt();
        int qtde = sc.nextInt();

        if (codigo == 1){
            total = qtde * cachorroQ;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (codigo == 2){
            total = qtde * xSalada;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (codigo == 3){
            total = qtde * xBacon;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (codigo == 4){
            total = qtde * torrada;
            System.out.printf("Total: R$ %.2f", total);
        }
        else {
            total = qtde * refri;
            System.out.printf("Total: R$ %.2f", total);
        }
        sc.close();
    }
}
