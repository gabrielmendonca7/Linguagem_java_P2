package desafios_26_02.Exemplo1;

import java.nio.channels.SelectableChannel;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();       /* Instanciada a classe funcionario */

        System.out.print("Digite seu nome: ");
        funcionario.setNome(sc.nextLine());                    /* Setado um nome ao funcionario */
        System.out.print("Digite sua matricula:  ");
        funcionario.setMatricula(sc.nextInt());                /* Setado uma matricula ao funcionario */
        System.out.print("Digite seu salário: ");
        funcionario.setSalario_Bruto(sc.nextDouble());         /* Setado um salario ao funcionario */

        System.out.printf("Matricula: %d \n" ,funcionario.getMatricula());     /* Chamando a matricula do funcionario pelo getter*/
        System.out.printf("Nome: %s \n", funcionario.getNome());          /* Chamando o nome do funcionario pelo getter*/
        System.out.printf("Salário bruto: %.2f \n", funcionario.getSalario_Bruto()); /* Chamando o salario bruto do funcionario pelo getter*/

        System.out.printf("Desconto de INSS: %.2f \n", funcionario.descontoInss(funcionario.getSalario_Bruto()));   /* Realizando a operação de descobrir o desconto pelo metodo "descontoInss" */
        System.out.printf("Salário líquido: %.2f \n", funcionario.salarioLiquido(funcionario.getSalario_Bruto()));   /* Realizando a operação de descobrir o salario liquido pelo metodo "salarioLiquido" */
        sc.close();
    }
}
