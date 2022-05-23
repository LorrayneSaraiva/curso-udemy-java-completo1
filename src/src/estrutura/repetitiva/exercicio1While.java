package src.estrutura.repetitiva;

import java.util.Scanner;

public class exercicio1While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();

    }
}
