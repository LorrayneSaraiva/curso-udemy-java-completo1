package src.estrutura.sequencial;

import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        //associando o scanner ao teclado no modo console
        Scanner sc = new Scanner(System.in);
        //String x;
        //x = sc.next();
        //System.out.println("Voce digitou: " + x);

        //int x;
        //x = sc.nextInt();
        //System.out.println(x);

        //double x;
        //x = sc.nextDouble();
        //System.out.println(x); //se fosse prinf, seria ,

        //char x;
        //x = sc.next().charAt(0);
        //System.out.println("Voce digitou: " + x);

        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();//encerrrar o recurso
    }
}
