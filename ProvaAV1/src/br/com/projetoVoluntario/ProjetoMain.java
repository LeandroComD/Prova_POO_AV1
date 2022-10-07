package br.com.projetoVoluntario;

import java.util.Scanner;

public class ProjetoMain {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int opcao;

        System.out.println("<1> Cadastrar Projeto Distribuir Alimentos\n" + "\n" + "<2> Cadastrar Projeto Trabalho Voluntário\n" + "\n" + "<3> Sair");
        opcao = ler.nextInt();

        switch (opcao){

            case 1:
                DistribuicaoAlimento distribuicaoAlimento = new DistribuicaoAlimento(descAlimento, qtde);
                System.out.println("");

                break;
        }


    }
}
