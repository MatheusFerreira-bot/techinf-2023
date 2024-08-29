
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

//2-Faça um programa que mostre nome, endereço e telefone.

public class Exe01020605 {
    
    public static void main(String args []){
        
        String Nome = JOptionPane.showInputDialog("Informe seu NOME: ");
        String Endereco = JOptionPane.showInputDialog("Informe seu ENDEREÇO: ");
        long Telefone = Long.parseLong(JOptionPane.showInputDialog("Informe seu TELEFONE: "));
        
        JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nEndereço: "+Endereco+"\nTelefone: "+Telefone);
    }
}
