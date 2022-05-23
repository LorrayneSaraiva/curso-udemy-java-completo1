//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1
package src.estrutura.repetitiva;

import java.util.Scanner;

public class exercicio5For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //n = 4
        int fat = 1;
        for (int i = 1; i <= n;i++){
            fat *= i;
        //teste de mesa
        //i = 1
        //1 = 1 * 1  fat = fat * 1
        //i = 2
        //1 = 1 * 2
        //i = 3
        //2 = 2 * 3
        //i = 4
        //6 = 6 * 4 = fat = 24
        }
        System.out.println(fat);

        sc.close();
    }
}
