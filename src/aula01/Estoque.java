package aula01;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(int codigo, String nome, int quantEstoque, double valor, double peso){
        Produto novoProduto = new Produto(codigo,nome,quantEstoque,valor,peso);
        produtos.add(novoProduto);
    }

    public void listarProdutos() {
        for (Produto p : produtos) {
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Quantidade em estoque: " + p.getQuantEstoque());
            System.out.println("Valor: " + p.getValor());
            System.out.println("Peso: " + p.getPeso());
            System.out.println("--------------------------");
        }
}
}
