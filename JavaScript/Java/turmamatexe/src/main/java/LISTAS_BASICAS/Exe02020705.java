
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*
2. Faça um algoritmo que leia as coordenadas (X,Y) de dois pontos, 
calcule e escreva a distância entre os mesmos.
*/

public class Exe02020705 {
    
    public static void main(String args []) {
        
       float X = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do ponto X: "));
       float Y = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do ponto Y: "));
       float Distancia = Y - X;
       
       JOptionPane.showMessageDialog(null,"A distância entre os dois pontos é de: "+Distancia);
        
    }
}
