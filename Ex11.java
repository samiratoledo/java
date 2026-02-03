/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que leia o nome de 10 alunos (vetor). Para cada aluno devem ser registradas 3 notas (matriz). 
        Calcular a média das notas de cada aluno e armazenar em um vetor.
        Ao final deverá ser exibido na tela um relatório com os dados de todos os alunos (nome, notas, media) e também a
        informação se o aluno foi aprovado ou reprovado (média para aprovação 7,0). 
        Para o caso de não aprovado exibir um asterisco no final da linha, após a média. 
        OBS: Utilizar o “System.out.print” e o “\t” para melhor apresentação do relatório.
         */

        //declaração do scanner
        Scanner sc = new Scanner(System.in);

        //declaração de variáveis 
        String nome[] = new String[10];
        double nota[][] = new double[10][3];
        double media[] = new double[10];
        double soma = 0;

        //entrada de dados (nome)
        for (int lin = 0; lin < 10; lin++) { //linha
            //recebendo o valor
            System.out.printf("Digite o nome do " + (lin + 1) + " aluno(a):: ");
            //atribuicao do valor a variavel nome
            nome[lin] = sc.next();

            // entrada de dados (notas)
            for (int col = 0; col < 3; col++) { //coluna
                //recebendo o valor
                System.out.printf("Digite a nota do(a) " + (nome[lin]) + ":: ");
                //atribuicao do valor a variavel nota 
                nota[lin][col] = sc.nextDouble();
                //pega as notas da linha e soma
                soma += nota[lin][col];
                //caso digite uma nota maior que 10
                if (nota[lin][col] > 10) {
                    //apresentacao do erro
                    System.out.printf("Digite a nota menor que ou igual a 10:: ");
                    //atribuicao do valor a variavel nota 
                    nota[lin][col] = sc.nextDouble();
                    //pega as notas da linha e soma
                    soma += nota[lin][col];
                }

            } //fim coluna
            //pega a o valor da soma e divide por 3, atribui na media 
            media[lin] = Math.round(soma / 3);
            //reseta a soma para as novas notas
            soma = 0;
            //pula linha
            System.out.print("\n");
        } //fim linha

        //apresentacao dos dados
        //titulo
        System.out.println("****** Media Escolar ******\n");
        //cabecalho
        System.out.println("Aluno \t            Notas\t       Media\t\n");

        //apresentacao dos dados (nomes, notas e media)
        for (int lin = 0; lin < 10; lin++) { //linha
            //apresentacao dos nomes
            System.out.print(nome[lin] + " ");

            for (int col = 0; col < 3; col++) { //coluna
                //apresentacao das notas
                System.out.print("\t" + nota[lin][col]);
            }
            //apresentacao da media 
            if (media[lin] < 7) {
                //se for menor que 7, recebe asterisco 
                System.out.print("\t" + media[lin] + "*");
            } else {
                //caso contrario, nao recebe
                System.out.print("\t" + media[lin]);
            }
            //pula linha
            System.out.print("\n");
        } // fim col
    }//fim lin 
}
