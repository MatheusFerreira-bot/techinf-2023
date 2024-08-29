
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

// 4-Faça um programa leia quatro números e mostre a média ponderada, sabendo 
// que o peso são respectivamente: 1,2,3,4.
// Mostre no final os números informados e a média.

public class Exe01040605 {
    
    public static void main(String args []) {
        
        float Num1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o PRIMEIRO número: "));
        float Num2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o SEGUNDO número: "));
        float Num3 = Float.parseFloat(JOptionPane.showInputDialog("Informe o TERCEIRO número: "));
        float Num4 = Float.parseFloat(JOptionPane.showInputDialog("Informe o QUARTO número: "));
        float P1 = 1F, P2 = 2F, P3 = 3F, P4 = 4F;
        float MediaPond = (Num1 + P1 + Num2 * P2 + Num3 * P3 + Num4 * P4) / (P1 + P2 + P3 + P4);
        
        JOptionPane.showMessageDialog(null,"Os números informados foram: "+Num1+", "+Num2+", "+Num3+" e "+Num4+
                "\nMédia Ponderada: "+MediaPond);
        
    }
    
}
