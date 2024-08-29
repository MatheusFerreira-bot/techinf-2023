
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
09) Fazer um programa que leia dois valores e retorne qual é o maior
*/

public class Exe03100805 {
    
    public static void main(String[] args) {
        
        float Valor1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro número: "));
        float Valor2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo número: "));
        
        if (Valor1 > Valor2){
            JOptionPane.showMessageDialog(null,"O número "+Valor1+" é maior que "+Valor2);
        }else{
            JOptionPane.showMessageDialog(null,"O número "+Valor2+" é maior que "+Valor1);
        }
    }
    
}