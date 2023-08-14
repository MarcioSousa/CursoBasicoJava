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
public class exemploWhile {
    public void exemploWhi(){
        double media, soma = 0;
        int num, qtde =0;
        char resp = 's';
        while (resp=='s' || resp == 'S'){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            soma = soma + num;
            qtde = qtde +1;
            resp = JOptionPane.showInputDialog("Deseja continuar").charAt(0);
        }
        
        media = soma/qtde;
        JOptionPane.showMessageDialog(null, "A média dos número digitados é: " + media);
        
    }
}
