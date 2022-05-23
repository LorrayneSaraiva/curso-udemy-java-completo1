package arrays.listas;

import arrays.listas.Vetor1;
import java.util.Scanner;

public class Vetor1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vetor1[] vetor = new Vetor1[10];
        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.printf("Rent #%d\n", i);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vetor[quarto] = new Vetor1(nome, email);//o quarto está apontando para essa classe
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i=0; i<10;i++){
            if (vetor[i] != null){
                System.out.println(i + ": "+ vetor[i]);
            }
        }

        sc.close();
    }
}
