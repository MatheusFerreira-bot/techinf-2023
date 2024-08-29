
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
06) Fazer um algoritmo que leia 2 valores e o tipo de media a ser calculada
entre eles aritmética ou ponderada (1º 30% e 2º 70%)
*/

public class Exe03070805 {
        public static void main(String args[]) {
        
        float Valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        float Valor2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo valor: "));
        float MediaA = (Valor + Valor2) / 2;
        float MediaPond = (Valor * 0.30F + Valor2 * 0.70F) / (0.30F + 0.70F);
        
        int TipoMedia = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo:\n\n[1] - Média"
                + "Aritmética\n[2] - Média Ponderada\n\nFaça sua escolha: "));
        
        if (TipoMedia == 1){
            JOptionPane.showMessageDialog(null,"Primeiro valor: "+Valor+
                    "\nSegundo Valor: "+Valor2+"\nSua média aritmética é: "+MediaA);
        }else if (TipoMedia == 2){
            JOptionPane.showMessageDialog(null,"Primeiro valor: "+Valor+
                    "\nSegundo Valor: "+Valor2+"Sua média ponderada é: "+MediaPond);
        }else{
            JOptionPane.showMessageDialog(null,"Não tem essa opção!");
        }
        
    }
}

   