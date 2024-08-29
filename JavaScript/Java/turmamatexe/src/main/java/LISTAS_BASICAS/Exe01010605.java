
package LISTAS_BASICAS;

//1-Faça um programa que leia um número e mostre seu sucessor e antecessor.

import javax.swing.JOptionPane;

public class Exe01010605{

    public static void main(String args []){
        
        int Num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        int Sucessor = Num + 1;
        int Antecessor = Num - 1;
        
        JOptionPane.showMessageDialog(null,"Número: "+Num+"\nSucessor: "+Sucessor+"\nAntecessor: "+Antecessor);
        
    }
}
