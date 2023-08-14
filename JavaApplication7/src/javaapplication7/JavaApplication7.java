/*
Criar um programa que leia uma palavra e mostre se tal palavra é um palíndromo ou não, exemplo: (implementar em linguagem de programação).
Digite uma palavra:
Roma
Resultado: Roma não é palíndromo
Digite uma palavra:
Reger
Resultado: Reger é palíndromo
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Marcio
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palavra;
        boolean naopalindromo = true;
        int p;
        
        Scanner entrada = new Scanner(System.in);
        palavra = entrada.next();
        
        p = palavra.length() -1;
        
        
        for(int t = 0; t < palavra.length(); t++){
            if(palavra.charAt(t) == palavra.charAt(p)){
                p--;
            }else{
                naopalindromo = false;
                break;
            }
        }
        
        if(naopalindromo == true){
            System.out.println(palavra + " é um palindromo");
        }else{
            System.out.println(palavra +" não é um palindromo");
        }
       
    }
    
}
