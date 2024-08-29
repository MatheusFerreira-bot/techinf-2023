package LISTA_MATRIZES;

import javax.swing.JOptionPane;

/*
03 - Fazer uma matriz 5x5 para guardar somente números par. Mostrar os números.
*/

public class Exe03032305 {
    
    public static void main(String[] args) {
        
        int MatPar[][] = new int[5][5];
        
        for (int Lin = 0; Lin < MatPar.length; Lin++) {
            for (int Col = 0; Col < MatPar[0].length; Col++) {
                int Num = 1;
                while (Num % 2 != 0){
                    Num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número par: "));
                }
                MatPar[Lin][Col] = Num;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int[] linha : MatPar) {
            for (int elemento : linha) {
                sb.append(elemento).append(' ');
            }
            sb.append('\n');
        }
        JOptionPane.showMessageDialog(null,sb.toString());
    }
}