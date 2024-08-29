
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*
8 - Faça um programa que leia e mostre nome, idade, sexo.
*/

public class Exe01080605 {
    
    public static void main(String[] args) {
        
        String Nome = JOptionPane.showInputDialog("Informe seu nome: ");
        int Idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
        String Sexo = JOptionPane.showInputDialog("Inforse seu sexo: ");
        
        JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nIdade: "+Idade+
                "\nSexo: "+Sexo);
    }
    
}