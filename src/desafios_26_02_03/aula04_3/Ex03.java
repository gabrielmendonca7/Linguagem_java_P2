package desafios_26_02_03.aula04_3;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        boolean rever = true;

        while (rever)  {
            System.out.printf("Digite uma opção: \n");
            System.out.printf("1 - SOMA \n");
            System.out.printf("2 - SUBTRAÇÃO \n");
            System.out.printf("3 - DIVISÃO \n");
            System.out.printf("4 - MULTIPLICAÇÃO \n");
            System.out.printf("0 - REVER OPERAÇÕES \n");

            calculadora.setOpcao(scanner.nextInt());

            System.out.print("Digite o primeiro número: ");
            calculadora.setNumero1(scanner.nextInt());
            System.out.print("Digite o segundo número: ");
            calculadora.setNumero2(scanner.nextInt());

            calculadora.Resultado();

            System.out.print("\nDeseja realizar novo calculo (zero (0) para sim): ");
            int resposta = scanner.nextInt();

            if (resposta != 0){
                rever = false;
                System.out.print("Encerrando...");
            }
        }
        scanner.close();
}
}

