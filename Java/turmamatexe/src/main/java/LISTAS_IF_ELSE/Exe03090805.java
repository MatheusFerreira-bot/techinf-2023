
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
 08) Fazer um algoritmo que leia o valor de um produto e a condição de
 pagamento: se for a vista 10% de desconto ou a prazo com 15% de juros.
 O algoritmo deverá retornar o valor final do produto.
*/

public class Exe03090805 {
    
        public static void main(String[] args) {
        
        float Valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da compra: "));
        float Vista = Valor - (Valor * 0.10F);
        float Prazo = Valor + (Valor * 0.15F);
        
        int TipoPag = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de pagamento:\n\n"
                + "[1] - Á vista\n[2] - A prazo\n\nFaça sua escolha: "));
        
        if (TipoPag == 1){
            JOptionPane.showMessageDialog(null,"Valor com de desconto de 10%: R$"+Vista);
        }else if (TipoPag == 2){
            JOptionPane.showMessageDialog(null,"Valor com juros de 15%: R$"+Prazo);
        }else{
            JOptionPane.showMessageDialog(null,"Não tem essa opção!");
        }
        
    }
    
}

