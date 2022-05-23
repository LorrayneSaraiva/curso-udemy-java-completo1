//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
package src.estrutura.condicional;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int duracao = 0;
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - (horaInicial - horaFinal);
        }
        System.out.printf("O jogo durou %d hora(s)", duracao);
        sc.close();
    }
}
