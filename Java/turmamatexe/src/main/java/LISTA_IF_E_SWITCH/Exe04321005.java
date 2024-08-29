
package LISTA_IF_E_SWITCH;

import javax.swing.JOptionPane;

/*
32. Faça um programa que leia um número de 1 a 12 e mostre o mês correspondente.
*/

public class Exe04321005 {
    public static void main(String args []) {
        
        int Mes = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        
        switch (Mes){
            
            case 1:
                JOptionPane.showMessageDialog(null,"Janeiro");
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null,"Fevereiro");
                break;
                
            case 3: 
                JOptionPane.showMessageDialog(null,"Março");
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null,"Abril");
                break;
                
            case 5:  
                JOptionPane.showMessageDialog(null,"Maio");
                break;
                
            case 6:
                JOptionPane.showMessageDialog(null,"Junho");
                break;
                
            case 7:
                JOptionPane.showMessageDialog(null,"Julho");
                break;
                
            case 8:
                JOptionPane.showMessageDialog(null,"Agosto");
                break;
                
            case 9:
                JOptionPane.showMessageDialog(null,"Setembro");
                break;
                
            case 10:
                JOptionPane.showMessageDialog(null,"Outrubro");
                break;
                
            case 11:
                JOptionPane.showMessageDialog(null,"Novembro");
                break;
                
            case 12:
                JOptionPane.showMessageDialog(null,"Dezembro");
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Não tem :P");
                break;
    
        }
        
    }
    
}
