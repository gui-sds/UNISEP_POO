package teste_sozin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner teclado_nome = new Scanner(System.in);
        System.out.print("Digite o nome do Professor: ");
        String nome = teclado_nome.nextLine();

        Scanner teclado_idade = new Scanner(System.in);
        System.out.print("Digite a idade do Professor: ");
        Integer idade = teclado_idade.nextInt();

        System.out.println("PROFESSOR: " + nome);
        System.out.println("IDADE: " + idade);
    }



}
