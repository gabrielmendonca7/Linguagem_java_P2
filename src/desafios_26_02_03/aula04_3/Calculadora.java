package desafios_26_02_03.aula04_3;

public class Calculadora {
    private int numero1,numero2,opcao;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    private int soma(int numero1, int numero2){
       return numero1 + numero2;
    }

    private int subtracao(int numero1,int numero2){
        return numero1 - numero2;
    }
    private int divisao(int numero1,int numero2){
        return numero1 / numero2;
    }
    private int multiplicacao(int numero1,int numero2){
        return numero1 * numero2;
    }

    public void Resultado(){

            switch (opcao){
                case 1:
                    System.out.printf("O resuldado da operação é: %d",soma(numero1,numero2));
                    break;
                case 2:
                    System.out.printf("O resuldado da operação é: %d",subtracao(numero1,numero2));
                    break;
                case 3:
                    if(numero1 == 0 || numero2 == 0){
                        System.out.print("Operação com divisor 0 não é permitido");
                        break;
                    }
                    System.out.printf("O resuldado da operação é: %d",divisao(numero1,numero2));
                    break;
                case 4:
                    System.out.printf("O resuldado da operação é: %d", multiplicacao(numero1,numero2));
                    break;
                default:
                    System.out.print("Operação não consta nas opções.");
                    break;

        }
    }
}
