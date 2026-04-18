package aula04;

public class Funcionario {
    private String nome;
    private int matricula;
    private double salario_Bruto;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return matricula;
    }

    public void setSalario_Bruto(double salario_Bruto){
        this.salario_Bruto = salario_Bruto;
    }
    public double getSalario_Bruto(){
        return salario_Bruto;
    }

    public double descontoInss(double salario){
        return salario * 0.15;
    }

    public double salarioLiquido(double salario){
        return salario_Bruto - descontoInss(salario);
    }
}
