//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
package src.estrutura.condicional;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        if (!(numero > 0)){
            System.out.println("Negativo");
        }
        else {
            System.out.println("Não negativo");
        }

        sc.close();
    }
}
