//Ler um número inteiro N e calcular todos os seus divisores.
package src.estrutura.repetitiva;

import java.util.Scanner;

public class Exercicio6For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int resultado = Divisores(n);

        sc.close();
    }
    public static int Divisores(int numero){
        int div = 0 ;
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                div = i;
                System.out.printf("%d\n",div);
            }
        }
        return  div;

    }
}
