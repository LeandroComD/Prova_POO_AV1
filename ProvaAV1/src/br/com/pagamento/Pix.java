package br.com.pagamento;

public class Pix extends Pagamento {
    boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean getComprovanteTransacaoPix() {
        return true;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public String imprimirCumpomFiscal(){
        return (getValorPago() + getNumeroPagamento() + getDataHoraPagamento());
    }



}
