
package LISTA_IF_E_SWITCH;

import javax.swing.JOptionPane;

/*
31. Crie um programa que leia um código de produto (de 1 a 5) e exiba sua descrição.
Utilize a seguinte tabela:
a) 1: "Produto A"
b) 2: "Produto B"
c) 3: "Produto C"
d) 4: "Produto D"
e) 5: "Produto E"
*/

public class Exe04311005 {
    public static void main(String args []) {
        
        String ProdutoA = "Arroz";
        String ProdutoB = "Feijão";
        String ProdutoC = "Óleo";
        String ProdutoD = "Trigo";
        String ProdutoE = "Leite";
        
        int CodProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto: "));
                       
//        int CodProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto:"+
//                "\n\n[ 1 ] - Produto A\n[ 2 ] - Produto B\n[ 3 ] - Produto C\n[ 4 ] - Produto D\n[ 5 ] - Produto E"+
//                "\n\nEscolha: "));
        
        switch (CodProduto) {
            
            case 1: 
                JOptionPane.showMessageDialog(null,ProdutoA);
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null,ProdutoB);
                break;
                
            case 3: 
                JOptionPane.showMessageDialog(null,ProdutoC);
                break;
                
            case 4: 
                JOptionPane.showMessageDialog(null,ProdutoD);
                break;
                        
            case 5:
                JOptionPane.showMessageDialog(null,ProdutoE);
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Não tem essa opção!");
                break;
                
        }
        
    }
    
}
