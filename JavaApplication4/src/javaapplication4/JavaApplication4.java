/*
Escreva um algoritmo para ler as dimensões de um 
retângulo (base e altura), calcular e escrever a 
área do retângulo.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Marcio
 */
public class JavaApplication4 {
    /* ÁREA DO RETÂNGULO */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base, altura;
        int area;
        
        Scanner entrada1 = new Scanner(System.in);
        base = entrada1.nextInt();
        
        Scanner entrada2 = new Scanner(System.in);
        altura = entrada2.nextInt();
        
        area = base * altura;
        
        System.out.println("A área do retângulo é: " + area);
        
    }
    
}
