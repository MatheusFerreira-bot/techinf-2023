package LISTA_WHILE;

import javax.swing.JOptionPane;

/*
1.Escreva um programa que calcule a soma dos N primeiros números naturais.
*/

public class Exe01011405 {
    
    public static void main(String[] args) {
        
        int Cont = 0;
        int Num;
        int Soma = 0;
        
        while(Cont < 5){
            Num = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            Soma += Num;
            Cont++;
        }
        JOptionPane.showMessageDialog(null,"Soma: "+Soma);
    }
}