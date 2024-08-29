
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*
9- Faça um programa que irá cadastrar clientes e produtos para uma determinada empresa, onde a empresa precisa os dados:
Cliente
Produto
*/
public class Exe01090605 {
    
    public static void main(String[] args) {
        
        //Cliente
        String Nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        long CPF = Long.parseLong(JOptionPane.showInputDialog("Informe o CPF: "));
        String Endereco = JOptionPane.showInputDialog("Informe o endereço: ");
        long Telefone = Long.parseLong(JOptionPane.showInputDialog("Informe o telefone: "));
        
        //Produto
        String Descricao = JOptionPane.showInputDialog("Informe a descrição do produto: ");
        int CodBarra = Integer.parseInt(JOptionPane.showInputDialog("Informe o código de barras: "));
        float Quantidade = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade: "));
        float Preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: "));
        
        //Saída Cliente
        JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nCPF: "+CPF+""
            +"\nEndereco: "+Endereco+"\nTelefone: "+Telefone);
         
        //Saída Produto
        JOptionPane.showMessageDialog(null,"Descriçaõ: "+Descricao+"\nCódigo de Barras: "
        +CodBarra+"\nQuantidade: "+Quantidade+"\nPreço: "+Preco);
        
        //Saída dos dois juntos.
        JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nCPF: "+CPF+""
            +"\nEndereco: "+Endereco+"\nTelefone: "+Telefone+"\nDescrição: "
                +Descricao+"\nCódigo de Barras: "+CodBarra+"\nQuantidade: "
                +Quantidade+"\nPreço: "+Preco);
        
    }
    
}
