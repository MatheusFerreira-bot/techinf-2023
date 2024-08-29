
package LISTA_IF_E_SWITCH;


import javax.swing.JOptionPane;

/*
4. Escreva um programa que leia três números inteiros e determine qual deles é o
maior.
*/

public class Exe04041005 {
    public static void main(String args []) {
        
        int Valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
        int Valor2 =  Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
        int Valor3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: "));
        
        if (Valor1 > Valor2 && Valor1 > Valor3){
            JOptionPane.showMessageDialog(null,"O primeiro valor é o maior!");
        }else if (Valor2 > Valor1 && Valor2 > Valor3){
            JOptionPane.showMessageDialog(null,"O segundo valor é o maior!");
        }else if (Valor3 > Valor1 && Valor3 > Valor2){
            JOptionPane.showMessageDialog(null,"O terceiro valor é o maior!");
        }else{
            JOptionPane.showMessageDialog(null,"Os valores são iguais!");
        }
        
    }
    
}
