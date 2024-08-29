
package LISTA_IF_E_SWITCH;

import javax.swing.JOptionPane;

/*
3. Faça um programa que calcule o preço final de um produto, considerando um
desconto de 10% se o valor for acima de R$ 100,00.
*/

public class Exe04031005 {
    public static void main(String args []) {
        
        float PrecoProduto = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do produto: "));

        if (PrecoProduto > 100){
            float ValorFinal = PrecoProduto - (PrecoProduto * 0.10f); //Criei a variável localmente, pois se trata apenas de uma verificação.
            JOptionPane.showMessageDialog(null,"Valor final do produto: "+ValorFinal);
        }else{
            JOptionPane.showMessageDialog(null,"Valor final do produto: "+PrecoProduto);
        }
        
    }
    
}
