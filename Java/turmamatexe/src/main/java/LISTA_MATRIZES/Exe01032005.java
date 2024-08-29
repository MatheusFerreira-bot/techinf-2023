package LISTA_MATRIZES;

import javax.swing.JOptionPane;

/*
03 - Faça uma algoritmo com uma matriz 8X3 de nomes
Mostrar os nomes no final.
*/

public class Exe01032005 {
    
    public static void main(String[] args) {
        
        String Nome[][] = new String[8][3];
        
        for (int Lin = 0; Lin < Nome.length; Lin++) {
            for (int Col = 0; Col < Nome[0].length; Col++) {
                Nome[Lin][Col] = JOptionPane.showInputDialog("Informe o nome: ");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String linha[] : Nome) {
            for (String elemento : linha ) {
                sb.append(elemento).append(' ');
            }
            sb.append('\n');
        }
        JOptionPane.showMessageDialog(null,sb);
    }
}