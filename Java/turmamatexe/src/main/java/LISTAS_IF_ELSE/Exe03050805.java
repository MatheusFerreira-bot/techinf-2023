
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
04) Fazer um programaque leia um valor e verifique se é divisível por 3 e 5 
ao mesmo tempo
*/

public class Exe03050805 {
    
    public static void main(String args[]) {
        
        float Numero = Float.parseFloat(JOptionPane.showInputDialog("Informe um número: "));
        
        if (Numero % 3 == 0 && Numero % 5 == 0){
            JOptionPane.showMessageDialog(null,"É divisivel por 3 e 5 ao mesmo tempo!");
        }else{
            JOptionPane.showMessageDialog(null,"Não é divisivel por 3 e 5 ao mesmo tempo!");
        }
    }
    
}
