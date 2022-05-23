//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

package src.estrutura.sequencial;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma, numero1, numero2;
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();


        soma = numero1 + numero2;

        System.out.printf("A Soma dos numeros %d e %d é %d", numero1, numero2, soma);

        sc.close();
    }
}
