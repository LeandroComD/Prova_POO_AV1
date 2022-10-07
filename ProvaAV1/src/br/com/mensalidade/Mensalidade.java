package br.com.mensalidade;

public class Mensalidade {
    double valorMensalidade;
    int numeroIrmaos;

    public Mensalidade(double valorMensalidade, int numeroIrmaos) {
        this.valorMensalidade = valorMensalidade;
        this.numeroIrmaos = numeroIrmaos;
    }

    public double calculaMensalidade(){
        double totalMensal=0;
        if(this.numeroIrmaos==1){
            totalMensal =valorMensalidade-((valorMensalidade*5)/100);
        }
        else if (this.numeroIrmaos==2){
            totalMensal =valorMensalidade-((valorMensalidade*2)/100);
        }
        else if (this.numeroIrmaos>2){
            totalMensal =valorMensalidade-((valorMensalidade*15)/100);
        }
        else if (this.numeroIrmaos==0){
            totalMensal =valorMensalidade-(valorMensalidade*0);
        }
        return totalMensal;
    }
}
