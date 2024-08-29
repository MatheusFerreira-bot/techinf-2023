
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*
10.Faça um algoritmo para ler a base e a altura de um triângulo. Em seguida,
escreva a área do mesmo.
*/

public class Exe01100605 {
    
    public static void main(String args []) {
        
        float Base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base: "));
        float Altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
        float Area = (Base * Altura) / 2;
        
        JOptionPane.showMessageDialog(null,"Base: "+Base+"\nAltura: "+Altura+
                "\nArea: "+Area);
        
    }
    
}
