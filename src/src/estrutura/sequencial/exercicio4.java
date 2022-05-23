//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
package src.estrutura.sequencial;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroFunc;
        double horasTrab, valorHora, salario;

        numeroFunc = sc.nextInt();
        horasTrab = sc.nextFloat();
        valorHora = sc.nextFloat();

        salario = horasTrab * valorHora;
        System.out.printf("Número do funcionário: %dn", numeroFunc);
        System.out.printf("Salário: R$ %.2f", salario);

        sc.close();
    }
}
