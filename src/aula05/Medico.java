package aula05;

    public class Medico {
        boolean trabalhaNoHospital;

        public Medico(boolean trabalhaNoHospital) {
            this.trabalhaNoHospital = trabalhaNoHospital;
        }

        public void tratarPaciente() {
            System.out.println("Medico tratando paciente");
        }
    }
