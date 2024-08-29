package LISTA_FOR;

import javax.swing.JOptionPane;

/*
4- Faça um programa que leia 200 números e retorne a soma dos valores divisíveis por 3
e 7 ao mesmo tempo.
*/

public class Exe01041605 {
    
    public static void main(String[] args) {
        
        float Num = 0f;
        float Soma = 0f;
        
        //for (int i = 0; i < 200; i++) {
        for (int i = 0; i < 10; i++) {
            Num = Float.parseFloat(JOptionPane.showInputDialog("Informe o número: "));
            if (Num % 3 == 0 && Num % 7 == 0){
                Soma += Num;
            }
        }
        JOptionPane.showMessageDialog(null,"Soma dos números: "+Soma);
    }
}