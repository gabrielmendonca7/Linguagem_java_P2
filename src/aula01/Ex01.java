package aula01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(1,"Mouse",10,99.99,0.100);

        System.out.print("Digite a opção desejada\n");
        System.out.print("1 - Adicionar Produto\n");
        System.out.print("2 - Listar produtos\n");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Nome: ");
                String nome = sc.nextLine();

                System.out.println("Código: ");
                int codigo = sc.nextInt();

                System.out.println("Quantidade em estoque: ");
                int quant = sc.nextInt();

                System.out.println("Valor: ");
                double valor = sc.nextDouble();

                System.out.println("Peso: ");
                double peso = sc.nextDouble();

                estoque.adicionarProduto(codigo,nome,quant,valor,peso);
                break;
            case 2:
                estoque.listarProdutos();
                break;
            default:
                System.out.print("Digite um valor valido na proxima vez.");
        }
        sc.close();
    }
}
