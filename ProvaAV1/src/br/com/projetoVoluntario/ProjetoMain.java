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
                DistribuicaoAlimento distribuicaoAlimento = new DistribuicaoAlimento();
                System.out.println(distribuicaoAlimento.validaProjeto() + distribuicaoAlimento.imprimeProjeto());
                break;
            case 2:
                TrabalhoVoluntario trabalhoVoluntario = new TrabalhoVoluntario();
                  System.out.println(trabalhoVoluntario.validaProjeto() + trabalhoVoluntario.imprimeProjeto());
                  break;

            case 3:
                System.out.println("Até mais!");
                break;
            default:
                System.out.println("Invalido");

        }


    }
}
