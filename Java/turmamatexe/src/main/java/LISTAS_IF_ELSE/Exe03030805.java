
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
02) Fazer um programa que leia um valor de 5 dígitos e verifique se é palíndromo
62526
*/

public class Exe03030805 {
    
    public static void main(String[] args) {
        
        int Numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor com 5 dígitos: "));
        int D1 = Numero / 10000;
        int D2 = (Numero % 10000) / 1000; 
        int D3 = (Numero % 1000) / 100;
        int D4 = (Numero % 100) / 10;
        int D5 = Numero % 10;     
        
        if (D1 == D5 && D2 == D4){
            JOptionPane.showMessageDialog(null,"O número é um palíndromo!");
        }else{
            JOptionPane.showMessageDialog(null,"O número não é um palíndromo!");
        }
        
    }
    
}
