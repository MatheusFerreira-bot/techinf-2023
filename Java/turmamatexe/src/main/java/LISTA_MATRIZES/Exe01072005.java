package LISTA_MATRIZES;

import javax.swing.JOptionPane;

/*
07 - Fazer uma matriz resultante de duas matriz 3X2. Mostrar todas as matrizes.
*/

public class Exe01072005 {
    
    public static void main(String[] args) {
        
        int Matriz1[][] = new int[3][2];
        int Matriz2[][] = new int[3][2];
        
        for (int Lin = 0; Lin < Matriz1.length; Lin++) {
            for (int Col = 0; Col < Matriz1[0].length; Col++) {
                Matriz1[Lin][Col] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da primeira matriz: "));
            }
        }
        for (int Lin = 0; Lin < Matriz2.length; Lin++) {
            for (int Col = 0; Col < Matriz2[0].length; Col++) {
                Matriz2[Lin][Col] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da segunda matriz: "));
            }
        }
        for (int Lin = 0; Lin < Matriz1.length; Lin++) {
            for (int Col = 0; Col < Matriz1[0].length; Col++) {
                System.out.print(Matriz1[Lin][Col]+" ");
            }
            System.out.println("");
        }
        for (int Lin = 0; Lin < Matriz2.length; Lin++) {
            for (int Col = 0; Col < Matriz2[0].length; Col++) {
                System.out.print(Matriz1[Lin][Col]+" ");
            }
            System.out.println("");
        }        
    }
}