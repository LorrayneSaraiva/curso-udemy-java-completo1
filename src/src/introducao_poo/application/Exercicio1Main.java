//Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de
//sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
package src.introducao_poo.application;
import src.introducao_poo.entities.Exercicio1Rectangle;

import java.awt.*;
import java.util.Scanner;

public class Exercicio1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Exercicio1Rectangle rectangle = new Exercicio1Rectangle();

        /*Exercicio1Rectangle x,y;
        x = new Exercicio1Rectangle();
        y = new Exercicio1Rectangle();
        System.out.println("Enter rectangle width and height:");
        x.width = sc.nextDouble();
        y.height = sc.nextDouble();
        */
        System.out.println("Enter rectangle width and height:");
        rectangle.height = sc.nextDouble();
        rectangle.width = sc.nextDouble();

        System.out.printf("Area: %.2f\n", rectangle.area());
        System.out.printf("Perimeter: %.2f\n", rectangle.perimeter());
        System.out.printf("Diagonal: %.2f\n", rectangle.diagonal());


        sc.close();
    }
}