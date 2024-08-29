package LISTA_WHILE;

import javax.swing.JOptionPane;

/*
2.Escreva um programa que imprima a tabuada de um número fornecido pelo usuário.
*/

public class Exe01021405 {
    
    public static void main(String[] args) {
        
        int Cont = 0;
        int Num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        
        while(Cont <= 10){
            JOptionPane.showMessageDialog(null,Num+" x "+Cont+" = "+Num*Cont);
            Cont++;
        }
    }
}