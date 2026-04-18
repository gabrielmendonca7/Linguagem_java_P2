package desafios_26_02_2.aula04_2;

import java.util.Arrays;

public class Sistema{
    private String nome;
    private double[] notas;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }
    public double[] getNotas(){
        return notas;
    }

    public void statusAcademico(double[] notas){
        double media = Arrays.stream(notas).average().orElse(0);

        if (media >= 70)
        {
            System.out.printf("O aluno %s está aprovado!",getNome());
        }
        else if (media < 40)
        {
            System.out.printf("O aluno %s está reprovado!",getNome());
        }
        else
        {
            System.out.printf("O aluno %s está na final!",getNome());
        }
    }
}
