/*
Faça um programa para o cálculo de uma folha de pagamento.
Para isso, o sistema deve saber o valor do salário.
Com base na descrição abaixo, exiba o texto dos descontos do IR:

• Salário até R$900,00 (inclusive) – “isento”;
• Salário de R$901,00 até R$ 1500, 00 (inclusive) – “desconto de 5%”;
• Salario de1501,00 até R$ 2500,00 (Inclusive) – “desconto de 10%”;
• Salário acima de 2500 – “desconto de 20%”.
 */

package desafios_19_02;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário bruto: ");
        double salario = sc.nextDouble();
        double salario_liquido;
        double excedente;
        double imposto;
        
        if (salario <= 900)
        {
            System.out.print("ISENTO");
        }
        else if (salario <= 1500)
        {
            excedente = salario - 900;
            imposto = excedente * 0.05;
            salario_liquido = salario - imposto;
            System.out.printf("Seu salário líquido é de: %.2f", salario_liquido);
        }
        else if (salario <= 2500)
        {
            excedente = salario - 1500;
            imposto = excedente * 0.1;
            salario_liquido = salario - imposto;
            System.out.printf("Seu salário líquido é de: %.2f", salario_liquido);
        }
        else
        {
            excedente = salario - 2500;
            imposto = excedente * 0.2;
            salario_liquido = salario - imposto;
            System.out.printf("Seu salário líquido é de: %.2f", salario_liquido);
        }
    }
}
