
package LISTA_MATRIZES;

import java.util.Arrays;
import javax.swing.JOptionPane;

/*
09 - Fazer uma matriz 4X4 mostrar a matriz
     - A diagonal principal
     - Quais os números da diagonais secundárias
     - Quais os números acima das diagonais secundárias
     - Qual o número que faz parte da diagonal principal e secundária
     - Quais os números abaixo da diagonal principal e secundária.
     - Quais os números acima da diagonal principal e secundária. 
*/

public class Exe01092005 {
    
    public static void main(String[] args) {
        
        int MatNum[][] = new int[4][4];
        
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                MatNum[Lin][Col] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            }
        }
        System.out.println("A matriz:");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                System.out.print(MatNum[Lin][Col]+" ");
            }
            System.out.println("");    
        }  
        System.out.println("Diagonal Principal");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if(Lin == Col){
                    System.out.print(" "+MatNum[Lin][Col]);
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");    
        }          
        System.out.println("Diagonal Secundária");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if(Lin + Col ==  6){
                    System.out.print(" "+MatNum[Lin][Col]);
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");    
        }    
        System.out.println("Quais os números acima das diagonais secundárias");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if(Lin + Col <= 5){
                    System.out.print(" "+MatNum[Lin][Col]);
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");    
        }  
        System.out.println("Qual o número que faz parte da diagonal principal e secundária");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if(Lin == Col && Lin+Col==6){
                    System.out.print(" "+MatNum[Lin][Col]);
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");    
        }   
        System.out.println("Quais os números abaixo da diagonal principal e secundária.");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if(Lin + Col == 6 && Lin > Col){
                    System.out.print(" "+MatNum[Lin][Col]);
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");    
        } 
        System.out.println("Quais os números acima da diagonal principal e secundária.");
        for (int Lin = 0; Lin < MatNum.length; Lin++) {
            for (int Col = 0; Col < MatNum[0].length; Col++) {
                if(Lin + Col < 6 && Lin < Col){
                    System.out.print(" "+MatNum[Lin][Col]);
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");    
        }          
    }
}