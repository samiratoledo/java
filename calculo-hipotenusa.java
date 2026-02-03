package calculo-hipotenusa;

import java.util.Scanner;

public class Ex22 {

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

