/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escreva um algoritmo que Leia 10 valores inteiros e armazene-os em um Vetor. 
        Após a digitação do último valor, imprima os elementos com conteúdo par.*/
        Scanner sc = new Scanner (System.in);
        double v [] = new double [10];
        
        for (int i =0; i<10; i++) {
        System.out.printf ("Digite o numero:: ");
        v [i] = sc.nextDouble();
        }
        
        for (int i=0; i<10; i++) { 
        if (v[i]%2 == 0) {
        System.out.println (v[i]);
        }
        
    }
        
        
        
    }
    
}
