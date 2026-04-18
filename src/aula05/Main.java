package aula05;

public class Main {
    public static void main(String[] args) {
        clinicoGeral clinico = new clinicoGeral(true, true);
        Cirugiao cirugiao = new Cirugiao(true);

        System.out.println("Trabalha no hospital: " + clinico.trabalhaNoHospital);
        System.out.println("Atende em casa: " + clinico.atendeEmCasa);
        clinico.tratarPaciente();
        clinico.receitar();
        cirugiao.tratarPaciente();
        cirugiao.fazerIncisao();
    }
}
