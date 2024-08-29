
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

//3-Faça um programa que leia um número e mostre a terça parte do mesmo.
//Mostrando no final qual o número e sua terça parte.

public class Exe01030605 {
    
    public static void main(String args []){
        
        float Num = Float.parseFloat(JOptionPane.showInputDialog("Informe o número: "));
        float TercaParte = Num * 0.03F;
        
        JOptionPane.showMessageDialog(null,"Número: "+Num+"\nTerça Parte: "+TercaParte);
             
    }
    
}
