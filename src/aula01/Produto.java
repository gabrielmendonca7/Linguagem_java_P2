package aula01;

public class Produto {
    private int codigo, quantEstoque;
    private double valor, peso;
    private String nome;

    public Produto(int codigo, String nome, int quantEstoque, double valor, double peso){
        this.codigo = codigo;
        this.nome = nome;
        this.quantEstoque = quantEstoque;
        this.valor = valor;
        this.peso = peso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }

    public void setQuantEstoque(int quantEstoque){
        this.quantEstoque = quantEstoque;
    }
    public int getQuantEstoque(){
        return quantEstoque;
    }
}
