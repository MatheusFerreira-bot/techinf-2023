package LISTA_WHILE;

import javax.swing.JOptionPane;

/*
6. Escreva um programa que determine e imprima o número de divisores de um número
inteiro fornecido pelo usuário
*/

public class Exe01061405 {
    
    public static void main(String[] args) {
        
        int Cont = 1;
        int Divisores = 0;
        int Num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        
        while (Cont <= Num) {
            if (Num % Cont == 0) {
                Divisores++;
            }
            Cont++;
        }
        JOptionPane.showMessageDialog(null,"Número de divisores: "+Divisores);
    }
}