package LISTA_WHILE;

import javax.swing.JOptionPane;

/*
5. Escreva um programa que solicite ao usuário uma série de números e calcule a
média deles.
*/

public class Exe01051405 {

    public static void main(String[] args) {
        
        int Cont = 0;
        float Num;
        float Soma = 0;
        float Media;
        int Limite = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos números você irá digitar: "));

        while (Cont < Limite) {
            Num = Float.parseFloat(JOptionPane.showInputDialog("Informe o número: "));
            Soma += Num;
            Cont++;
        }
        Media = Soma / Cont;
        JOptionPane.showMessageDialog(null,"Média: "+Media);
    }
}