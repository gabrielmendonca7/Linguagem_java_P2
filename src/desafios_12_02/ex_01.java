package desafios_12_02;

/*
Faça um programa que calcule o salário de um funcionário com
base no valor da hora trabalhada de R$ 15.00 e na quantidade de
40 horas trabalhadas e exiba o salário.
 */

public class ex_01 {
    public static void main(String[] args){

        double valor_por_hora = 15;
        double hora_trabalhada = 40;
        double salario = valor_por_hora * hora_trabalhada;

        System.out.printf("O seu salário no período foi de: %.2f", salario);
    }
}
