
package LISTA_IF_E_SWITCH;

import javax.swing.JOptionPane;

/*
14. Crie um programa que leia as notas de três provas e calcule a média final. Se a
média for maior ou igual a 7,0, o aluno está aprovado; caso contrário, está
reprovado.
*/

public class Exe04141005 {
    public static void main(String args []) {
        
        float Nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: "));
        float Nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: "));
        float Media = (Nota1 + Nota2) / 2;
        
        if (Media >= 7){
            JOptionPane.showMessageDialog(null,"Aprovado");
        }else{
            JOptionPane.showMessageDialog(null,"Reprovado");
        }
        
    }
    
}
