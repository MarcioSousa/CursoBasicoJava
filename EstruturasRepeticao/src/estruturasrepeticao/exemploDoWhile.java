
package estruturasrepeticao;

import javax.swing.JOptionPane;

public class exemploDoWhile {
    public void dowhileex(){
        int num, soma =0;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            
            if(num%2 != 0){
                soma = soma + num;
            }
        }while(num!=0);
        
        JOptionPane.showMessageDialog(null, "A soma dos número impares: " + soma);
    }
}
