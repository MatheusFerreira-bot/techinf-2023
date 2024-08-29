
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
0 - Faça uma programa que ao ser informado
um número verifique se é positivo ou negativo.
*/

public class Exe03010805 {
    
    public static void main(String args[]) {
        
        int Numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        
        if (Numero > 0){
            JOptionPane.showMessageDialog(null,"É positivo!");
        }else{
            JOptionPane.showMessageDialog(null,"É negativo!");
        }
        
    }
    
}