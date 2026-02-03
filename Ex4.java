/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que leia dois valores reais e apresente a diferença do maior para o menor. 
         Um método chamado diferença deverá ser impelementado para realizar os cáculos e exibir o resultado.
         */

        //declaracao do scanner sc para entrada de dados
        Scanner sc = new Scanner(System.in);

        //entrada de dados e atribuicao
         //recebendo o primeiro valor
        System.out.println("Digite o primeiro numero: ");
        //atribuicao do valor a variavel a
        double a = sc.nextDouble();

        //recebendo o segundo valor
        System.out.println("Digite o segundo numero: ");
        //atribuicao do valor a variavel b
        double b = sc.nextDouble();

        //passando parametros para o metodo
        double r = diferenca(a, b);
    }

    public static double diferenca(double c, double d) {
        //r recebe 0
        double r = 0;
        //se c for menor que d
        if (c < d) {
            //c subtrai d 
            r = d - c;
            //apresentacao do resultado
            System.out.println("Diferenca: " + r);
        }
        //se c for menor que c
        else if (d < c) {
            //d subtrai c 
            r = c - d;
            //apresentacao do resultado
            System.out.println("Diferenca: " + r);
        }
        //retorna o resultado 
        return r;
    }
}
