
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
11)Criar um programa que permita ao aluno responder qual a capital do Brasil. Sendo Todas 
as possibilidades deverão ser pensadas. Ex.: Brasília, brasília, BRASÍLIA.
*/

public class Exe03160805 {
    
    public static void main(String[] args) {
        
        String Capital = JOptionPane.showInputDialog("Informe o nome da capital do Brasil: ");
        
        
        if (Capital.equals("Brasília")){
            JOptionPane.showMessageDialog(null,"Acertou!");
        }else if (Capital.equals("brasília")){
            JOptionPane.showMessageDialog(null,"É com B maiúsculo, vamos ser formais.");
        }else if (Capital.equals("brasilia")){
            JOptionPane.showMessageDialog(null,"B maiúsculo e tem acento, ok?"); 
        }else if (Capital.equals("Brasil")){
            JOptionPane.showMessageDialog(null,"KKKKKKKK esse é o nome do país");
        }else{
            JOptionPane.showMessageDialog(null,"EU DESISTO!");
        }
    }
    
}
