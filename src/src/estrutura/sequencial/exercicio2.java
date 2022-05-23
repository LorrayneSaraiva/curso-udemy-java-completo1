//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159
package src.estrutura.sequencial;

//import kotlin.math.UMathKt;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio, area, pi = 3.14159;

        raio = sc.nextDouble();
        // raio = Math.sqrt(raio);
        area = pi * raio *raio;

        System.out.printf("O valor da area é: %.4f ", area);



        sc.close();
    }
}
