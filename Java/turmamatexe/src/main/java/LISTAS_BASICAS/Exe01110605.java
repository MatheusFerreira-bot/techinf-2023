
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*
11. O índice de massa corpórea (IMC), embora não seja preciso, é um indicativo 
inicial sobre a situação da quantidade de gordura de um indivíduo. 
Sabendo-se que o IMC pode ser calculado pela expressão abaixo
(sendo m a massa em quilogramas e h a altura em metros), 
escreva um programa que leia a massa e a altura de uma pessoa, 
escrevendo seu IMC. Fórmula abaixo:
IMC=  m/h^2 
*/

public class Exe01110605 {
    
    public static void main(String[] args) {
        
        float Altura = Float.parseFloat(JOptionPane.showInputDialog("Informe sua altura: "));
        float Peso = Float.parseFloat(JOptionPane.showInputDialog("Informe seu peso: "));
        double IMC = Peso / (Altura * Altura);
        
        JOptionPane.showMessageDialog(null,"Altura: "+Altura+"\nPeso: "+Peso+
                "\nIMC: "+IMC);
    }
    
}
