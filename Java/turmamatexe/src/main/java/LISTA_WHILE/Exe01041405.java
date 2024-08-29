package LISTA_WHILE;

import javax.swing.JOptionPane;

/*
4. Escreva um programa que converta uma faixa de temperaturas de Celsius para
Fahrenheit utilizando uma estrutura de repetição.
*/

public class Exe01041405 {
    
    public static void main(String[] args) {
        
        int Cont = 0;
        float Temperatura;
        float Fahrenheit; 
        int Limite = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas temperaturas você irá converter: "));
        
        while (Cont < Limite) {
            Temperatura = Float.parseFloat(JOptionPane.showInputDialog("Informe a temperatura: "));
            Fahrenheit = (Temperatura * 1.8f) + 32f;
            JOptionPane.showMessageDialog(null,"Temperatura em Celsius: "+Temperatura+"°C\nTemperatura em Fahrenheit: "+
                    Fahrenheit+"°F");
        Cont++;    
        }
    }
}