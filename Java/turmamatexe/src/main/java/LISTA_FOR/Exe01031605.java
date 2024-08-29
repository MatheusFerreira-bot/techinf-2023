package LISTA_FOR;

import javax.swing.JOptionPane;

/*
3- Faça um programa ler 10 valores, calcular e escrever a média aritmética destes valores
*/

public class Exe01031605 {
    
    public static void main(String[] args) {
        
        float Num = 0f;
        float Soma = 0f;
        float Media = 0f;
        int i;
        
        for (i = 0; i < 10; i++) {
            Num = Float.parseFloat(JOptionPane.showInputDialog("Informe o número: "));
            Soma += Num;
        }
        Media = Soma / i;
        JOptionPane.showMessageDialog(null,"Média dos números: "+Media);
    }
}