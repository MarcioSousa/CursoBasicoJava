/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetoresmatruz;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcio
 */
public class Matriz01 {
    public void EncontrarValor(){
        int[][] matriz = new int[5][4];
        int busca, i, j, i1 = 0, j1=0;
        
        boolean achou = false;
        
        for(i=0; i<5;i++){
            for(j=0; j<4;j++){
                matriz[i][j]= Integer.parseInt(JOptionPane.showInputDialog ("Posição ["+i+"]["+j+"]"));
            }
        }

        busca = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor a buscar?"));
        
        for(i=0; i<5;i++){
            for(j=0; j<4;j++){
                if(matriz[i][j]==busca){
                    achou= true;
                    i1=i;
                    j1=j;
                }
            }
        }

        if (achou==false){
            JOptionPane.showMessageDialog(null, "Elemento não encontrado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Elemento encontrado na posição "+i1+", "+j1);
        }
    }
}
