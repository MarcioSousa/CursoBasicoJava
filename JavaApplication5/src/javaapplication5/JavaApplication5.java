/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
Considerar ano com 365 dias e mês com 30 dias.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Marcio
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ano;
        int meses;
        int dias;
        int resultado;
        
        Scanner entrada1 = new Scanner(System.in);
        ano = entrada1.nextInt();
        
        Scanner entrada2 = new Scanner(System.in);
        meses = entrada2.nextInt();
        
        Scanner entrada3 = new Scanner(System.in);
        dias = entrada3.nextInt();
        
        resultado = (ano * 365) + (meses * 30) + dias;
        
        System.out.println("A IDADE DA PESSOA, EM DIAS, É: " + resultado);
        
    }
    
}
