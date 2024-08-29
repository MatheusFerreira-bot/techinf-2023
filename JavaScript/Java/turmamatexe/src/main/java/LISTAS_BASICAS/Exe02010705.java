
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*
1. Faça um algoritmo que leia dois números inteiros, trocar o conteúdo desses números.
*/

public class Exe02010705 {
    
    public static void main(String args []) {
        
        float Num1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        float Num2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo valor: "));
        
        Num1 = Num2 + Num1;
        Num2 = Num1 - Num2;
        Num1 = Num1 - Num2;
        
        JOptionPane.showMessageDialog(null,"Primeiro valor: "+Num1+"\nSegundo valor: "+Num2);
        
    }
    
}