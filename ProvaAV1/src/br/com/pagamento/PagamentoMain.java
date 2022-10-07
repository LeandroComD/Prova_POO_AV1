package br.com.pagamento;

public class PagamentoMain {
    public static void main(String [] args) {
        Pagamento Comprovante = new Pagamento("12/12 às 12:12", 121212, 12.96);

        CartaoCredito Comprovante1 = new CartaoCredito("12/12 às 12:12", 111112555, 12.96, "1212121-00", "Mastecard", "Leandro");

        CartaoDebito Comprovante2 = new CartaoDebito("12/12 às 12:12", 111112555, 12.96, "1212121-00", "Leandro");

        Pix Comprovante3 = new Pix("12/12 às 12:12", 111112555, 12.96, true);

        System.out.println(Comprovante.dataHoraPagamento + "----" + Comprovante.numeroPagamento + "----" + Comprovante.valorPago);
        System.out.println(Comprovante.dataHoraPagamento + "----" + Comprovante1.numeroPagamento + "----" + Comprovante1.valorPago + "----" + Comprovante1.getNumCartao() + "----" + Comprovante1.getBandeiraCartao() + "----" + Comprovante1.getTitularCartao());
        System.out.println(Comprovante2.dataHoraPagamento + "----" + Comprovante2.numeroPagamento + "----" + Comprovante2.valorPago + "----" + Comprovante2.getNumCartao() + "----" + Comprovante2.titularCartao);
        System.out.println(Comprovante3.dataHoraPagamento + "----" + Comprovante3.numeroPagamento + "----" + Comprovante3.valorPago + "----" + Comprovante3.getComprovanteTransacaoPix());
    }


}
