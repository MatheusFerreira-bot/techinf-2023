package LISTA_MATRIZES;

import javax.swing.JOptionPane;

/*
06 - Fazer uma matriz 10x10 com desconto de irrf, no final mostrar.
*/

public class Exe03062305 {
    
    public static void main(String[] args) {
        
        float salabruto[][] = new float[10][10];
        float descirrf[][] = new float[10][10];
        int Lin = 0, Col = 0;
            
        final float lim1 = 2259.20f;
        final float lim2 = 2826.65f;
        final float lim3 = 3751.05f;
        final float lim4 = 4664.68f;
        final float Tx1 = 0.075f;
        final float Tx2 = 0.15f;
        final float Tx3 = 0.225f;
        final float Tx4 = 0.275f;
        final float Ded1 = 169.44f;
        final float Ded2 = 381.44f;
        final float Ded3 = 662.77f;
        final float Ded4 = 896f;    
        
        for (Lin = 0; Lin < salabruto.length; Lin++) {
            for (Col = 0; Col < salabruto[0].length; Col++) {
                if (salabruto[Lin][Col] <= lim1){
                   descirrf[Lin][Col] = 0;
               }else if (salabruto[Lin][Col] <= lim2){
                   descirrf[Lin][Col] = salabruto[Lin][Col] *  Tx1 - Ded1;
               }else if (salabruto[Lin][Col] <= lim3){
                   descirrf[Lin][Col] = salabruto[Lin][Col] *  Tx2 - Ded2;
               }else if (salabruto[Lin][Col] <= lim4){
                   descirrf[Lin][Col] = salabruto[Lin][Col] * Tx3 - Ded3;
               }else{
                   descirrf[Lin][Col] = salabruto[Lin][Col] * Tx4 - Ded4;
               }
            }   
        } 
        for (Lin = 0; Lin < salabruto.length; Lin++) {
            for (Col = 0; Col < salabruto[0].length; Col++) {
                System.out.println("Salário: "+salabruto+
                "\nDesconto: "+descirrf+"\n");   
            }
            System.out.println("");
        }    
    }  
}