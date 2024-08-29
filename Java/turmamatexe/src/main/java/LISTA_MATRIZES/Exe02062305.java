package LISTA_MATRIZES;

import javax.swing.JOptionPane;

/*
06 - fazer uma matriz 3x4 e outra de 4x3 que resultará em outra matriz com a multiplicação das duas.
*/

public class Exe02062305 {
    
    public static void main(String[] args) {
        
        float MatNum1[][] = new float[3][4];
        float MatNum2[][] = new float[4][3];
        float Mult[][] = new float[3][3];
        
        for (int Lin = 0; Lin < MatNum1.length; Lin++) {
            for (int Col = 0; Col < MatNum1[0].length; Col++) {
                MatNum1[Lin][Col] = Float.parseFloat(JOptionPane.showInputDialog("Informe o número da primeira matriz: "));
            }
        }
        
        for (int Lin = 0; Lin < MatNum2.length; Lin++) {
            for (int Col = 0; Col < MatNum2[0].length; Col++) {
                MatNum2[Lin][Col] = Float.parseFloat(JOptionPane.showInputDialog("Informe o número da segunda matriz: "));
            }
        }
        
        for (int Lin = 0; Lin < 3; Lin++) {
            for (int Col = 0; Col < 3; Col++) {
                Mult[Lin][Col] = 0;
                for (int k = 0; k < 4; k++) {
                    Mult[Lin][Col] += MatNum1[Lin][k] * MatNum2[k][Col];
                }
            }
        }
        
        StringBuilder Resultado = new StringBuilder();
        for (int Lin = 0; Lin < Mult.length; Lin++) {
            for (int Col = 0; Col < Mult[0].length; Col++) {
                Resultado.append(Mult[Lin][Col]).append(" ");
            }
            Resultado.append("\n");
        }
        JOptionPane.showMessageDialog(null,Resultado.toString());
    }
}