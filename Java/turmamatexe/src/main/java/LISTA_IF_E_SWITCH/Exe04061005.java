
package LISTA_IF_E_SWITCH;

import javax.swing.JOptionPane;

/*
6. Crie um programa que determine se um ano é bissexto ou não.
*/

public class Exe04061005 {
    public static void main(String args []) {
        
        int Ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
        
        if (Ano % 4 == 0){
            JOptionPane.showMessageDialog(null,"É ano bissexto!");
        }else{
            JOptionPane.showMessageDialog(null,"Não é ano bissexto!");
        }
        
    }
    
}
