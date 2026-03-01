package desafios_12_02;
import java.util.Scanner;
import java.util.Locale;

/*
Elabore um programa que receba 3 notas (informadas pela
pessoa desenvolvedora). Em seguida, calcule a média e verifique
se o aluno está aprovado, reprovado ou na final.

Observação: Aprovado >= 70, Reprovado < 40.

Desafio: Como saber se está na final?
 */

public class Ex03 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 70)
        {
            System.out.print("Aprovado");
        }
        else if (media < 40)
        {
            System.out.print("Reprovado");
        }
        else
        {
            System.out.print("Necessário realização de prova final.");
        }
    }
}
