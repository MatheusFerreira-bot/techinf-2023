
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*

4. Uma lanchonete serve os seguintes produtos com os respectivos preços:
 
•	X burguer	R$ 2,50
•	X frango	R$ 2,00
•	X salada	R$ 1,50
•	Batata frita	R$ 0,80
•	Sucos	        R$ 0,90
•	Refrigerantes	R$ 1,20
 
Faça um algoritmo que leia as quantidades de cada um dos itens acima de um 
determinado cliente, calcule e escreva o valor total do pedido.

*/

public class Exe02040705 {
    
    public static void main(String args[]) {
        
        int XBurguer = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos X-BURGUER você deseja: "));
        int XFrango = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos X-FRANGO você deseja: "));
        int XSalada = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos X-SALADA você deseja: "));
        int BatFrita = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas BATATAS FRITAS você deseja: "));
        int Sucos = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos SUCOS você deseja: "));
        int Refri = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos REFRIGERANTES você deseja: "));
        float VlrTotal = (XBurguer * 2.50F) + (XFrango * 2.00F) + (XSalada * 1.50F) + 
                (BatFrita * 0.80F) + (Sucos * 0.90F) + (Refri * 1.20F);
        
        JOptionPane.showMessageDialog(null,"----- TABELA DE PEDIDOS -----\n\n"
                + "X-Burguer: "+XBurguer+"\nX-Frango: "+XFrango+"\nX-Salada: "+
                XSalada+"\nBatata Frita: "+BatFrita+"\nSucos: "+Sucos+"\nRefrigerantes: "+
                Refri+"\n\nTotal a ser pago: "+VlrTotal);
        
    }
}
