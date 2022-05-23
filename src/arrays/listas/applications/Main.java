package arrays.listas.applications;

import arrays.listas.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario;
        System.out.print("Quantos funcionarios vão ser registrados?");
        int n = sc.nextInt();

        List<Funcionario> list = new ArrayList<>();
        for (int i=1; i<=n;i++){
            System.out.println();
            System.out.printf("Funcionário #%d:",i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            //Funcionario func = new Funcionario(id, nome, salario);
            //list.add(func); e tira esse list.add(new...)
            list.add(new Funcionario(id, nome, salario));
        }
        System.out.println();
        System.out.print("Insira o id do funcionário que terá aumento salarial: ");
        int id = sc.nextInt();
        //vou querer os funcionarios x, tal que x.getid seja igual id
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        //ou Integer func = posicao(list,id)
        if (func == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Insira a porcentagem: ");
            double porcentual = sc.nextDouble();
            //list.get(func).aumento(porcentual)
            func.aumento(porcentual);
        }
        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionario obj : list){
            System.out.println(obj);
        }

        sc.close();
    }
    //procura a posição do elemento na lista
    //essa list não tem nada a ver com a que está no main
    /*public static Integer posicao(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

     */
}
