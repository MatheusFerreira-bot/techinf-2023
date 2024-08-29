package LISTA_MATRIZES;

import java.util.Arrays;
import javax.swing.JOptionPane;

/*
02 - Fazer uma matriz 3X3 para guardar somente números impar Mostrar os números.
*/

public class Exe03022305 {
    
    public static void main(String[] args) {
        
        final int TAM = 3;
        int [][] MatImpar = new int[TAM][TAM]; 

        for(int Lin=0;Lin<MatImpar.length;Lin++){
            for(int Col=0;Col<MatImpar[0].length;Col++){
                int Num=0;
                while( Num % 2 == 0){ 
                    Num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número Impar:"));
                    if(Num % 2 == 0){
                    }
                } 
                MatImpar[Lin][Col]= Num;
            } 
        }
        StringBuilder sb = new StringBuilder();
            for (int[] linha : MatImpar) {
                for (int elemento : linha) {
                    sb.append(elemento).append(' ');
                }
            sb.append('\n');
            }
         JOptionPane.showMessageDialog(null,
         sb.toString());  
    }
}        