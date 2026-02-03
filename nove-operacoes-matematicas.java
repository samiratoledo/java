package nove-operacoes-matematicas;

//importacao dos pacotes de entrada de dados
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex33 {

    public static void main(String[] args) {

        /*Exercício 4: Escreva um programa para calcular cada uma das operações matemática. Crie um método
        para cada uma da operações e apresente o resultado utilizando System.out.println().
        1 – Soma
        2 – Subtração
        3 – Divisão
        4 – Multiplicação
        5 – Resto da Divisão 
        6 – Dobro
        7 – Quadrado
        8 – Cubo
        9 – Raiz Quadrada
        0 – Sair
        - Crie um método para realizar os cálculos e apresentar o resultado de cada item solicitado.*/
        
        //declaracao de variaveis
        int i = 1;
        double a, b;

        //declaracao do scanner sc para entrada de dados
        Scanner sc = new Scanner(System.in);

        //manter o programa rodando ate o usuario digitar 0
        while (i != 0) {

            //escolha do metodo, i recebe o valor/metodo digitado 
            i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite:\n 1 – Soma\n 2 – Subtração\n 3 – Divisão\n 4 – Multiplicação\n 5 – Resto da Divisão \n 6 – Dobro\n 7 – Quadrado\n 8 – Cubo\n 9 – Raiz Quadrada\n 0 – Sair"));

            //logica dos metodos dos metodos
            switch (i) {

                //caso soma (1)
                case 1:
                    //entrada de dados e atribuicao
                    //recebendo o primeiro valor
                    System.out.printf("Digite o 1 numero: ");
                    //atribuicao do valor a variavel a
                    a = sc.nextDouble();
                    //recebendo o segundo valor
                    System.out.printf("Digite o 2 numero: ");
                    //atribuicao do valor a variavel b
                    b = sc.nextDouble();
                    //passando parametros para o metodo
                    double r = soma(a, b);
                    //apresentacao dos dados
                    System.out.println("O resultado da soma " + a + " + " + b + " = " + r + "\n");
                    //parar a execucao do codigo
                    break;

                //caso subtracao (2)
                case 2:
                    //entrada de dados e atribuicao
                    //recebendo o primeiro valor
                    System.out.printf("Digite o 1 numero: ");
                    //atribuicao do valor a variavel a
                    a = sc.nextDouble();
                    //recebendo o segundo valor
                    System.out.printf("Digite o 2 numero: ");
                    //atribuicao do valor a variavel b
                    b = sc.nextDouble();
                    //passando parametros para o metodo
                    r = subtracao(a, b);
                    //apresentacao dos dados
                    System.out.println("O resultado da subtracao " + a + " - " + b + " = " + r + "\n");
                    //parar a execucao do codigo
                    break;

                //caso divisao (3)
                case 3:
                    //entrada de dados e atribuicao
                    //recebendo o primeiro valor
                    System.out.printf("Digite o 1 numero: ");
                    //atribuicao do valor a variavel a
                    a = sc.nextDouble();
                    //recebendo o segundo valor
                    System.out.printf("Digite o 2 numero: ");
                    //atribuicao do valor a variavel b
                    b = sc.nextDouble();
                    //passando parametros para o metodo
                    r = divisao(a, b);
                    //apresentacao dos dados
                    System.out.println("O resultado da divisao " + a + " / " + b + " = " + r + "\n");
                    //parar a execucao do codigo
                    break;

                //caso multipicacao (4)
                case 4:
                    //entrada de dados e atribuicao
                    //recebendo o primeiro valor
                    System.out.printf("Digite o 1 numero: ");
                    //atribuicao do valor a variavel a
                    a = sc.nextDouble();

                    System.out.printf("Digite o 2 numero: ");
                    //atribuicao do valor a variavel b
                    b = sc.nextDouble();
                    //passando parametros para o metodo
                    r = multiplicacao(a, b);
                    //apresentacao dos dados
                    System.out.println("O resultado da multiplicacao " + a + " * " + b + " = " + r + "\n");
                    //parar a execucao do codigo
                    break;

                //caso resto da divisao (5)
                case 5:
                    //entrada de dados e atribuicao
                    //recebendo o primeiro valor
                    System.out.printf("Digite o 1 numero: ");
                    //atribuicao do valor a variavel a
                    a = sc.nextDouble();
                    //recebendo o segundo valor
                    System.out.printf("Digite o 2 numero: ");
                    //atribuicao do valor a variavel b
                    b = sc.nextDouble();
                    //passando parametros para o metodo
                    r = restoDivisao(a, b);
                    //apresentacao dos dados
                    System.out.println("O resultado da resto da divisao " + a + " % " + b + " = " + r + "\n");
                    //parar a execucao do codigo
                    break;

                //caso dobro (6)
                case 6:
                    //entrada de dados e atribuicao
                    //recebendo o valor
                    System.out.printf("Digite o numero: ");
                    //atribuicao do valor a variavel a
                    a = sc.nextDouble();
                    //passando parametros para o metodo
                    r = dobro(a);
                    //apresentacao dos dados
                    System.out.println("O resultado do dobro de " + a + " = " + r + "\n");
                    //parar a execucao do codigo
                    break;

                //caso ao quadrado (7)
                case 7:
                    //entrada de dados e atribuicao
                    //recebendo o valor
                    System.out.printf("Digite o numero: ");
                    //atribuicao do valor a variavel a
                    a = sc.nextDouble();
                    //passando parametros para o metodo
                    r = quadrado(a);
                    //apresentacao dos dados
                    System.out.println("O resultado do quadrado de " + a + " = " + r + "\n");
                    //parar a execucao do codigo
                    break;

                //caso ao cubo (8)
                case 8:
                    //entrada de dados e atribuicao
                    //recebendo o valor
                    System.out.printf("Digite o numero: ");
                    //atribuicao do valor a variavel a
                    a = sc.nextDouble();
                    //passando parametros para o metodo
                    r = cubo(a);
                    //apresentacao dos dados
                    System.out.println("O resultado do cubo de " + a + " = " + r + "\n");
                    //parar a execucao do codigo
                    break;

                //caso raiz quadrada (9)
                case 9:
                    //entrada de dados e atribuicao
                    //recebendo o valor
                    System.out.printf("Digite o numero: ");
                    //atribuicao do valor a variavel a
                    a = sc.nextDouble();
                    //passando parametros para o metodo
                    r = raiz(a);
                    //apresentacao dos dados
                    System.out.println("O resultado da raiz quadrada de " + a + " = " + r + "\n");
                    //parar a execucao do codigo
                    break;

                //outro numero alem de 1 a 9
                default:
                    //apresenta que o programa foi encerrado
                    System.out.println("Programa encerrado");
                    //parar a execucao do codigo
                    break;

            } //switch

        } //while

    } //main

    public static double soma(double c, double d) {
        //faz a soma 
        double r = c + d;
        //retorna o resultado e atribui a r
        return r;
    } // fim soma

    public static double subtracao(double c, double d) {
        //faz a subtracao e atribui a r
        double r = c - d;
        //retorna o resultado
        return r;
    } //fim sub

    public static double multiplicacao(double c, double d) {
        //faz a multiplicacao e atribui a r
        double r = c * d;
        //retorna o resultado
        return r;
    } //fim mult

    public static double divisao(double c, double d) {
        //faz a divisao e atribui a r
        double r = c / d;
        //retorna o resultado
        return r;
    } //fim div

    public static double restoDivisao(double c, double d) {
        //faz o resto da divisao e atribui a r
        double r = c % d;
        //retorna o resultado
        return r;
    } //fim resto

    public static double dobro(double c) {
        //faz o dobro e atribui a r
        double r = c * 2;
        //retorna o resultado
        return r;
    } //fim dobro

    public static double quadrado(double c) {
        //faz o quadrado e atribui a r
        double r = c * c;
        //retorna o resultado
        return r;
    } //fim quadrado

    public static double cubo(double c) {
        //faz o cubo e atribui a r
        double r = c*c*c;
        //retorna o resultado
        return r;
    } //fim cubo

    public static double raiz(double c) {
        //faz a raiz quadrada e atribui a r
        double r = Math.sqrt(c);
        //retorna o resultado
        return r;
    } //fim raiz

}

