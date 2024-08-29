
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*
3. Faça um algoritmo que leia as medidas dos três lados de um triângulo, 
calcule e escreva o seu perímetro e a sua área.
*/

public class Exe02030705 {
    
    public static void main(String args[]) {
        
      float L1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro lado: "));
      float L2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo lado: "));
      float L3 = Float.parseFloat(JOptionPane.showInputDialog("Informe o terceiro lado: "));
      float Base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base do triângulo: "));
      float Altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do triângulo: "));
      float Perimetro = L1 + L2 + L3;
      float Area = (Base * Altura) / 2; 
      
      JOptionPane.showMessageDialog(null,"Primeiro lado: "+L1+"\nSegundo lado: "+L2+
              "\nTerceiro lado: "+L3+"\nBase: "+Base+"\nAltura: "+Altura+"\nPerimetro: "+
              Perimetro+"\nArea: "+Area);
      
    }
    
}
