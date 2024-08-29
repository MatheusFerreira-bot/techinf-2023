package LISTA_MATRIZES;

import javax.swing.JOptionPane;

/*
06 - Fazer uma matriz 4X4 somente de números positivos, que serão informados.
Mostrar a matriz final.
*/

public class Exe01062005 {
    
    public static void main(String[] args) {
        
        int MatNum[][] = new int[4][4];
        
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum.length; Col++) {
                do{
                    MatNum[Lin][Col] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
                }while(MatNum[Lin][Col] > 0);
            }
        }
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                
            }
        }
    }
}
