package aula05;

public class Cirugiao extends Medico {
    public Cirugiao(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);
    }

    @Override
    public void tratarPaciente() {
        System.out.println("Cirurgião está tratando o paciente");
    }

    public void fazerIncisao() {
        System.out.println("Cirurgião está fazendo incisão");
    }
}
