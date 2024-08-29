package LISTA_MATRIZES;

/*
05 - Fazer uma matriz 10x10 com desconto de inss, no final mostrar. 
*/

import javax.swing.JOptionPane;

public class Exe03052305 {
    
    public static void main(String[] args) {
      
        float SalBruto[][] = new float[10][10]; 
        float DescINSS[][] = new float[10][10];
        int Lin = 0, Col = 0;

        final float Lim1 = 1412f;
        final float Lim2 = 2666.68f;
        final float Lim3 = 4000.03f;
        final float Lim4 = 7786.02f;
        final float UltLim = 1090.04f;
        final float Tx1 = 0.095f;
        final float Tx2 = 0.11f;
        final float Tx3 = 0.14f;
        final float Tx4 = 0.20f;
        final float Ded1 = 21.18f;
        final float Ded2 = 108.18f;
        final float Ded3 = 181.18f;           
      
      
        for (Lin = 0; Lin < SalBruto.length; Lin++) {
            for (Col = 0; Col < SalBruto[0].length; Col++) {
                if (SalBruto[Lin][Col] <= Lim1){
                    DescINSS[Lin][Col] = SalBruto[Lin][Col] * Tx1;
                }else if (SalBruto[Lin][Col] <= Lim2){
                    DescINSS[Lin][Col] = SalBruto[Lin][Col] * Tx2 - Ded1;
                }else if (SalBruto[Lin][Col] <= Lim3){
                    DescINSS[Lin][Col] = SalBruto[Lin][Col] * Tx3 - Ded2;
                }else if (SalBruto[Lin][Col] <= Lim4){
                    DescINSS[Lin][Col] = SalBruto[Lin][Col] * Tx4 - Ded3;
                }else{
                    DescINSS[Lin][Col] = SalBruto[Lin][Col] * UltLim;
                }                
            }
        }
        for (Lin = 0; Lin < SalBruto.length; Lin++) {
            for (Col = 0; Col < SalBruto[0].length; Col++) {
                System.out.println("Salário: R$\"+SalBruto[Lin][Col]+\nDesconto: R$"+DescINSS[Lin][Col]+"\n");
            }
            System.out.println("");
        }
    }
}