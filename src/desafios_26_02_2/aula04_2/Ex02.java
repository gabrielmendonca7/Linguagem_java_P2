package desafios_26_02_2.aula04_2;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema();

        System.out.printf("Digite seu nome: ");
        sistema.setNome(sc.nextLine());

        System.out.printf("Quantas notas deseja inserir: ");
        int quantidade = sc.nextInt();

        double[] notasDigitadas = new double[quantidade];

        for (int i = 0; i < quantidade; i++){
            System.out.printf("Digite sua nota (%d): ",i+1);
            notasDigitadas[i] = sc.nextDouble();
        }

        sistema.statusAcademico(notasDigitadas);
    }
}
