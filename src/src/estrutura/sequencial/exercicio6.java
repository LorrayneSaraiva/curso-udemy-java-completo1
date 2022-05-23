//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.
package src.estrutura.sequencial;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, aTriRetangulo, aCirculo, pi = 3.14159, aTrapezio,
        aQuadrado, aRetangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        //area do triângulo retângulo
        System.out.printf("Triângulo: %.3f\n", aTriRetangulo = a * c / 2);
        System.out.printf("Círculo: %.3f\n", aCirculo = c * c * pi);
        System.out.printf("Trapezio: %.3f\n", aTrapezio = (a + b) * c / 2.0);
        System.out.printf("Quadrado: %.3f\n", aQuadrado = b * b);
        System.out.printf("Retângulo: %.3f\n", aRetangulo = a * b);

        sc.close();
    }
}
