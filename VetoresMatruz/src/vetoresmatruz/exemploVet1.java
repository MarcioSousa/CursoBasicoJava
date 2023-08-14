package vetoresmatruz;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcio
 */
public class exemploVet1 {
    public void aula(){
        float[] salario = new float[5];
        
        //salario[0] = 1100.15f;
        //salario[1] = 650.15f;
        //salario[2] = 11.05f;
        //salario[3] = 150.15f;
        //salario[4] = 15.52f;
        
        for(int i =0; i< 5; i++){
            salario[i] = Float.parseFloat(JOptionPane.showInputDialog("Entre com o salário"));
        }
        
        for(int i=0; i<5; i++){
            JOptionPane.showMessageDialog(null, "Funcionário: " + ( i+1) + "Salário: " + salario[i]);
        }
    }
}
