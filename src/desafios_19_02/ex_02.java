package desafios_19_02;

/*
Elabore um programa que verifique se uma variável é maior,
menor ou igual a outra e exiba esta informação na tela e exiba.
 */

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero_1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero_2 = sc.nextInt();

        sc.close();

        if (numero_1 > numero_2)
        {
            System.out.printf("O primeiro número: %d, é maior que o segundo: %d", numero_1, numero_2);
        }
        else if (numero_1 < numero_2)
        {
            System.out.printf("O segundo número: %d, é maior que o primeiro: %d", numero_2, numero_1);
        }
        else
        {
            System.out.printf("Ambos os números são iguais: %d e %d", numero_1, numero_2);
        }
    }
}
