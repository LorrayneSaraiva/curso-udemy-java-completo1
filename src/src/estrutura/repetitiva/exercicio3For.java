//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5
package src.estrutura.repetitiva;

import java.util.Scanner;

public class exercicio3For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            double valor1 = sc.nextDouble();
            double valor2 = sc.nextDouble();
            double valor3 = sc.nextDouble();

            media = ((valor1 * 2) +(valor2 * 3) + (valor3 * 5)) / 10;

            System.out.printf("%.1f\n", media);
        }
        sc.close();
    }
}
