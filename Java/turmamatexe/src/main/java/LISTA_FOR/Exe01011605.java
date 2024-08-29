package LISTA_FOR;

import javax.swing.JOptionPane;

/*
1. Faça um algoritmo para ler um número 
inteiro e escrevê-lo na tela 10 vezes
*/

public class Exe01011605 {
    
    public static void main(String[] args) {
        
      int Num=0;
      String result ="";
      Num =Integer.parseInt(JOptionPane.showInputDialog("Informe o Número: "));
      int Quant = Integer.parseInt(JOptionPane.showInputDialog("Informe Quant: "));
      
      for(int i=0;i<Quant;i++){
      result += String.valueOf(Num)+"  ";
      }
      JOptionPane.showMessageDialog(null,"O resultado: "+result);
    }
}