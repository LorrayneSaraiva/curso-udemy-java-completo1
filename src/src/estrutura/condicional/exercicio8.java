package src.estrutura.condicional;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double imposto;
        double salario = sc.nextDouble();

        if (salario >= 0 && salario <= 2000.00){
            System.out.println("Isento");
        }
        else if (salario >= 2000.01 && salario <= 3000.00){
            imposto = salario - 2000.00;
            imposto *= 0.08;
            System.out.printf("R$ %.2f", imposto);
        }
        else if (salario >= 3000.01 && salario <= 4500.00){
            imposto = (salario - 2000.00) - 1000.00;
            imposto *= 0.18;
            System.out.printf("R$ %.2f", (1000.00 * 0.08) + imposto);
        }
        else {
            imposto = (salario - 2000.00) - 2500.00 ;
            System.out.printf("R$ %.2f", (imposto *= 0.28) + (1000.00 * 0.08)+(1500.00 * 0.18) );
        }

        /*switch (salario){
            case (salario >= 0 && salario <= 2000.00):
                System.out.println("Isento");
                break;
            case (salario >= 2000.01 && salario <= 3000.00):
                imposto = salario - 2000.00;
                imposto *= 0.08;
                System.out.printf("R$ %.2f", imposto);
                break;
            case (salario >= 3000.01 && salario <= 4500.00):
                imposto = (salario - 2000.00) - 1000.00;
                imposto *= 0.18;
                System.out.printf("R$ %.2f", (1000.00 * 0.08) + imposto);
                break;
            default:
                imposto = (salario - 2000.00) - 2500.00;
                imposto *= 0.28;
                System.out.printf("R$ %.2f", (1000.00 * 0.08)+(1500.00 * 0.18)+(imposto * 0.28));

        }*/
        sc.close();
    }
}
