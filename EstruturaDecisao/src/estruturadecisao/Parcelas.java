/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadecisao;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcio
 */
public class Parcelas {
    
    public static void main(String[] args) {
        double valor_parcelado, valor_compra, valor_final;
        int qtde_parcelas, juros;   
        
        valor_compra = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da compra"));
        qtde_parcelas = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de parcelas"));
        
        switch(qtde_parcelas){ 
            case 2:
                juros = 3;
                break;
            case 4:
                juros = 7;
                break;
            case 6:
                juros = 9;
                break;
            case 8:
                juros = 12;
                break;
            default:
                juros = -1;
        }
        
        if(juros == -1){
            JOptionPane.showMessageDialog(null, "Número de parcelas incorreto");
        }else{
            valor_final = valor_compra + valor_compra* juros / 100;
            valor_parcelado = valor_final/qtde_parcelas;
            JOptionPane.showMessageDialog(null, "O valor de cada parcela é " + valor_parcelado);
        }
    }
            
}
