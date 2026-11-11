package AULA_02;
import java.util.Scanner;


public class Main {

    public static void main (String[] args){

        Scanner teclado_nomeFuncionario = new Scanner(System.in);
        System.out.print("Digite o nome do Funcionario: ");
        String nome = teclado_nomeFuncionario.nextLine();

        Scanner teclado_salarioBase = new Scanner(System.in);
        System.out.print("Digite o Sálario base de " + nome + ": ");
        double salarioBase = teclado_salarioBase.nextDouble();



        System.out.print("Funcionario: " + nome + "\nSalário base: " + salarioBase);
    }
}
















