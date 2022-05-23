//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"
package src.estrutura.repetitiva;

import java.util.Scanner;

public class exercicio4For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double divisao = 0;
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num2 != 0){
               divisao = (double)  num1 / num2;
                System.out.printf("%.1f", divisao);
            }
            else {
                System.out.println("Divisao impossivel");
            }
        }
        sc.close();
    }
}
