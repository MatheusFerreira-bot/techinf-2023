package LISTA_MATRIZES;

import javax.swing.JOptionPane;

/*
05 - fazer um programa com matriz 4x2, mostrar a matriz e depois de mostrar multiplicar seus valores por 3 e mostrar o resultado.
*/

public class Exe02052305 {
    
    public static void main(String[] args) {
        
        float MatNum[][] = new float[4][2];
        float MatMult[][] = new float[4][2];
        
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                MatNum[Lin][Col] = Float.parseFloat(JOptionPane.showInputDialog("Informe o número: "));
                MatMult[Lin][Col] = MatNum[Lin][Col] * 3;
            }
        }
        // Matriz com os números fornecidos.
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                System.out.print(MatNum[Lin][Col]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        // Matriz com os números multiplicados por 3.
        for (int Lin = 0; Lin < MatMult.length; Lin++) {
            for (int Col = 0; Col < MatMult[0].length; Col++) {
                System.out.print(MatMult[Lin][Col]+" ");
            }
            System.out.println("");
        }
    }
}