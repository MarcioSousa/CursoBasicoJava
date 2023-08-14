/*
Crie um programa que receba um número. Se o número for par apresente o quadrado, se for ímpar apresente o cubo. (implementar em linguagem de programação)
Exemplo 1:
Digite um número:
2
2 é um número par e seu quadrado é 4 (pois 2²=4)
Exemplo 2:
Digite um número:
3
3 é um número ímpar e seu cubo é 27 (pois 3³=27)
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Marcio
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int quadrado = 0;
        int cubo = 0;
        
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        
        //System.out.println(numero % 2);
        
        if((numero % 2) == 0){
            quadrado = numero * numero;
            System.out.println(numero + " é um número par e seu quadrado é " + quadrado + "(pois " + numero + "²=" + quadrado + ")");
        }else{
            cubo = numero * numero * numero;
            System.out.println(numero + " é um número impar e seu cubo é " + cubo + "(pois " + numero + "³=" + cubo + ")");
        }
    }
    
}
