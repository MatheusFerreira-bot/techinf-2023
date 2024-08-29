package LISTA_WHILE;

import javax.swing.JOptionPane;

/*
1.Escreva um programa que calcule a soma dos N primeiros números naturais.
*/

public class Exe010114051_DoWhile {
    
    public static void main(String[] args) {
        
        int Cont = 0;
        int Num;
        int Soma = 0;
        
        do{
            Num = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            Soma += Num;
            Cont++;
        }while(Num != 0);
        JOptionPane.showMessageDialog(null,"Soma: "+Soma);
    }
}