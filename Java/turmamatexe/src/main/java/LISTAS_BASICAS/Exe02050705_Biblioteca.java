
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

public class Exe02050705_Biblioteca {
    
    public static void main(String[] args) {
        
     String NomePessoa = JOptionPane.showInputDialog("Informe o NOME: ");
     String NomeLivro = JOptionPane.showInputDialog("Informe o NOME do LIVRO: "); 
     String Autor = JOptionPane.showInputDialog("Informe o AUTOR do LIVRO: ");
     String DataEmprestimo = JOptionPane.showInputDialog("Informe a DATA do EMPRÉSTIMO: ");
     String DataDevolucao = JOptionPane.showInputDialog("Informe a DATA de DEVOLUÇÃO: ");
     
     JOptionPane.showMessageDialog(null,"----- PEDIDO EMPRÉSTIMO DE LIVROS -----\n\n"
             + "Nome: "+NomePessoa+"\nLivro: "+NomeLivro+"\nAutor: "+Autor+
             "\nData Empréstimo: "+DataEmprestimo+"\nData Devolução: "+DataDevolucao);
        
    }
    
}
