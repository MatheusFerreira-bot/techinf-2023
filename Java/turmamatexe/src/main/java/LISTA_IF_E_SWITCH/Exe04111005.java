
package LISTA_IF_E_SWITCH;

import javax.swing.JOptionPane;

/*
11. Faça um programa que leia o código de um produto e sua quantidade em estoque.
Se o estoque for menor que 10 unidades, mostre uma mensagem "Estoque baixo",
se for entre 10 e 20 unidades, "Estoque médio", e se for maior que 20 unidades,
"Estoque alto".
*/

public class Exe04111005 {
    public static void main(String args []) {
        
        int CodProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto: "));
        int Quant = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade em estoque: "));
        
        if (Quant < 10){
            JOptionPane.showMessageDialog(null,"Estoque baixo");
        }else if (Quant < 21){
            JOptionPane.showMessageDialog(null,"Estoque médio");
        }else{
            JOptionPane.showMessageDialog(null,"Estoque alto");
        }
        
    }
    
}
