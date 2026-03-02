package desafios_19_02;

/*
a. Inicialmente, ler os dados de cada funcionário (matrícula, nome e salário bruto);

b. Depois, o programa deve processar o desconto do INSS, que é 15% do salário bruto,
e o salário líquido é a diferença entre o salário bruto e a dedução do INSS.

c. Por fim, exibir na tela o seu contracheque, cujo formato é dado a seguir
• Matrícula:
• Nome completo:
• Salário Bruto:
• Dedução INSS:
• Salário Líquido:
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua matrícula: ");
        int mat = sc.nextInt();
        System.out.print("Digite seu salário: ");
        double salarioBruto = sc.nextDouble();

        double descontoInss = salarioBruto * 0.15;
        double salarioLiquido = salarioBruto - descontoInss;

        System.out.print("--------CONTRACHEQUE---------\n");
        System.out.printf("Sua matrícula: %d \n",mat);
        System.out.printf("Seu nome: %s\n",nome);
        System.out.printf("Seu salario bruto: %.2f\n",salarioBruto);
        System.out.printf("Seu desconto de INSS: %.2f\n",descontoInss);
        System.out.printf("Seu salario liquído: %.2f", salarioLiquido);

        sc.close();
    }
}
