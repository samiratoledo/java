/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex22;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class Ex22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que calcule e retorne o valor da hipotenusa através do método hipotenusa. 
        O método deverá receber o valor da base e da altura de um triângulo. C = √(a² + b²*/

        //declaracao de variaveis 
        double base, alt;

        //declaracao do scanner sc
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.printf("Digite a base: ");
        //atribuicao do valor a variavel base
        base = sc.nextDouble();

        System.out.printf("Digite a altura: ");
        //atribuicao do valor a variavel alt
        alt = sc.nextDouble();

        //atribuindo a hp o resultado do metodo, com os parametros base e altura
        double hp = calculoHipotenusa(base, alt);

        //apresentacao do valor
        System.out.println("Hipotenusa: " + hp);
    }

    public static double calculoHipotenusa(double b, double h) {
        //atribuindo a c o resultado 
        double c = Math.sqrt((b * b) + (h * h));
        //retornando o valor 
        return c;
    }

}
