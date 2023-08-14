/*
Implemente o seguinte algoritmo em alguma linguagem de 
programação e realize os testes de mesa, apresentando 
as mensagens de saída na tabela abaixo:
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Marcio
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c;
        double media;
        
        Scanner entrada1 = new Scanner(System.in);
        a = entrada1.nextDouble();
        
        Scanner entrada2 = new Scanner(System.in);
        b = entrada2.nextDouble();
        
        Scanner entrada3 = new Scanner(System.in);
        c = entrada3.nextDouble();
        
        media = (a + b+ c) /3;
        
        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media >=5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
        
    }
    
}
