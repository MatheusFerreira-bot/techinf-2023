
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*6-Faça um programa com a base e a altura de um retângulo e mostre a seguinte saída:
a - Perimetro
b - Area
c - Diagonal*/

public class Exe01060605 {
    
    public static void main(String args []) {
        
        float Base = Float.parseFloat(JOptionPane.showInputDialog("Informe a BASE: "));
        float Altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a ALTURA: "));
        float Perimetro = 2 * (Base + Altura); 
        float Area = Base * Altura;
        float Diagonal = (float) Math.sqrt(Math.pow(Altura,2) + Math.pow(Base,2));
        
        JOptionPane.showMessageDialog(null,"Base: "+Base+"\nAltura: "+Altura+
                "\nPerimetro: "+Perimetro+"\nArea: "+Area+"\nDiagonal: "+Diagonal);
        
    }
    
}
