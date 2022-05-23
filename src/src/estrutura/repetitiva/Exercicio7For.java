//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo
package src.estrutura.repetitiva;

import java.util.Scanner;

public class Exercicio7For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int resultado = Valores(n);

        sc.close();
    }
    public static int Valores(int numero){
        for(int i = 1; i <= numero; i++){
            int indice = i;
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%d %d %d\n", indice, quadrado, cubo);
        }
        return numero;
    }
}
