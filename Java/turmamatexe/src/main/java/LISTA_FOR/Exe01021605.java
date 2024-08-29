package LISTA_FOR;

import javax.swing.JOptionPane;

/*
2- Faça um programa que mostre os números ímpares existentes de entre 1(inclusive) e
900(inclusive).
*/

public class Exe01021605 {
    
    public static void main(String[] args) {
        
        int Impares = 0;
        String Result = "";
        
        for (int i = 0; i < 10; i++) {
        //for (int i = 0; i < 900; i++) {
            if (i % 2 != 0){
                Result += String.valueOf(i)+" ";
            }
        }
        JOptionPane.showMessageDialog(null,"Números impares: "+Result);
    }
}