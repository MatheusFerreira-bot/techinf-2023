
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
01) Fazer um programa que leia a idade de uma pessoa e informe se é maior de idade ou não
*/

public class Exe03020805 {
    
    public static void main(String[] args) {
        
        int Idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
        
        if (Idade < 12){
            JOptionPane.showMessageDialog(null,"Criança");
        }else if (Idade < 18){
            JOptionPane.showMessageDialog(null,"Adolescente");
        }else{
            JOptionPane.showMessageDialog(null,"Adulto");
        }
    }
    
}
