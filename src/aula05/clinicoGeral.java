package aula05;

    public class clinicoGeral extends Medico {
        boolean atendeEmCasa;

        public clinicoGeral(boolean trabalhaNoHospital, boolean atendeEmCasa) {
            super(trabalhaNoHospital);
            this.atendeEmCasa = atendeEmCasa;
        }

        public void receitar() {
            System.out.println("Clinico geral receitando remedio");
        }

        @Override
        public void tratarPaciente() {
            System.out.println("Clinico geral tratando paciente");
        }
    }
