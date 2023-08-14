/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasrepeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcio
 */
public class Somatoria {
    public void soma(){
        double soma =0;
        double n1;
        int i;
        
        for(i = 1; i<= 10; i++){
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
            soma = soma + n1;
        }
        JOptionPane.showMessageDialog(null, "A somatótia é " + soma);
        
    }
}
