package src.estrutura.repetitiva;

import java.util.Scanner;

public class exercicio3While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0 , diesel = 0;
        int codigo = sc.nextInt();

        while (codigo != 4){
            if (codigo == 1){
                alcool++;
            }
            else if (codigo == 2){
                gasolina++;
            }
            else if (codigo == 3){
                diesel++;
            }
            codigo = sc.nextInt();
        }
        System.out.println("Muito obrigado");
        System.out.printf("Alcool: %d \n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
        sc.close();
    }
}
