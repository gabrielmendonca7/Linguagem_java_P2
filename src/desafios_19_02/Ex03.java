package desafios_19_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        System.out.println("Bem-vindo ao calculador de média de aluno!");
        System.out.print("Insira uma nota do aluno: ");
        notas.add(sc.nextDouble());
        double media;

        while(true){
            System.out.print("Deseja inserir outra nota? (Digite 'S' para Sim ou 'N' para Não): " );
            char resposta = sc.next().toUpperCase().charAt(0);

            if(resposta == 'S')
            {
                System.out.print("Insira uma nota do aluno: ");
                notas.add(sc.nextDouble());
            }
            else if (resposta == 'N')
            {
                media = notas.stream().mapToDouble(Double::doubleValue).sum() / notas.size();
                break;
            }
        }

        System.out.printf("Média das notas: %.2f \n", media);
        System.out.println("Obrigado por utilizar o sistema!");
        sc.close();
    }
}
