package desafios_19_02;

/*
Elabore um programa que solicite o nome e a idade de uma pessoa.

O sistema deve utilizar teclado para capturar estes dados, exibir e ao final, perguntar se
a pessoa usuária deseja repetir para fazer um novo cadastro.

Para isso, use equalsIgnoreCase.
*/

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja realizar um cadastro de usuário? (S ou N) ");
        String cadastro = sc.next();
        sc.nextLine();

        while(cadastro.equalsIgnoreCase("S")) {

            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.printf("Seu nome é %s e sua idade é %d\n",nome,idade);

            System.out.print("Deseja realizar um novo cadastro? (S ou N) ");
            cadastro = sc.next();
            sc.nextLine();
        }

        System.out.print("Agradecemos sua participação!");
        sc.close();
    }
}
