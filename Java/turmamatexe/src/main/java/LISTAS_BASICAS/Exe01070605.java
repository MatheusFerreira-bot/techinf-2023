
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*
7-Faça um programa para calcular o valor do volume de uma lata de óleo, utilizando a fórmula: 
volume = 3.14159 * R^2 * altura
*/

public class Exe01070605 {
    
    public static void main(String args []) {
        
        float Raio = Float.parseFloat(JOptionPane.showInputDialog("Informe o raio: "));
        float Altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
        float Volume = (float) (3.14f * Math.pow(Raio,2) * Altura);
        
        JOptionPane.showMessageDialog(null,"Raio: "+Raio+"\nAltura: "+Altura+
                "\nVolume: "+Volume);
    }
    
}
