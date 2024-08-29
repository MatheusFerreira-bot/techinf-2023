
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
03) Fazer um programa que leia o valor da base e altura de um retângulo e 
retorne se esse retângulo é também quadrado
*/

public class Exe03040805 {
    
    public static void main(String args []) {
        
        float Base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base: "));
        float Altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
        
        if (Base == Altura){
            JOptionPane.showMessageDialog(null,"Pode ser um quadrado!");
        }else{
            JOptionPane.showMessageDialog(null,"Não pode ser um quadrado!");
        }
    }
    
}
