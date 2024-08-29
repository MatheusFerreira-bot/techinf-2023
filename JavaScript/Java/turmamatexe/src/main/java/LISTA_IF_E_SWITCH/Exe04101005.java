
package LISTA_IF_E_SWITCH;

import javax.swing.JOptionPane;

/*
10. Crie um programa que determine se uma pessoa pode ou não votar, considerando
a idade mínima de 16 anos para votar no Brasil.
*/

public class Exe04101005 {
    public static void main(String args []) {
        
        int Idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        
        if (Idade > 15){
            JOptionPane.showMessageDialog(null,"Pode votar");
        }else{
            JOptionPane.showMessageDialog(null,"Não pode votar");
        }
        
    }
    
}
