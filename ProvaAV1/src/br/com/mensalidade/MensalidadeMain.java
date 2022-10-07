package br.com.mensalidade;

public class MensalidadeMain {
    public static void main(String [] args) {

        Mensalidade valor = new Mensalidade(1000.0, 1);
        System.out.println("A o valor da mensalidade é: " + valor.calculaMensalidade());

    }
}
