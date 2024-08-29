
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*
5. Faça os programas dos cadastros a seguir:
	a) Emissão de Passagem aérea:
	b) Locação de Fita de vídeo uma locadora: 
	c) Empréstimo de Livro de uma biblioteca: 
	d) Cadastro de Carro em uma concessionária: 
	e) Cadastro de Disciplinas de uma escola: 
Obs: No máximo 06 dados para cada um cadastro.	
*/

public class Exe02050705_Locacao {
    
    public static void main(String[] args) {
        
     String Nome = JOptionPane.showInputDialog("Informe o NOME: ");
     long CPF = Long.parseLong(JOptionPane.showInputDialog("Informe o CPF: "));
     String Endereco = JOptionPane.showInputDialog("Informe o ENDEREÇO: ");
     int Telefone = Integer.parseInt(JOptionPane.showInputDialog("Informe o TELEFONE: "));
     String FitaAlugada = JOptionPane.showInputDialog("Informe o NOME da FITA ALUGADA: ");
     String TempoAlugado = JOptionPane.showInputDialog("Informe o TEMPO ALUGADO: ");
     
     JOptionPane.showMessageDialog(null,"----- PEDIDO LOCAÇÃO -----\n\nNome: "+Nome+
             "\nCPF: "+CPF+"\nEndereço: "+Endereco+"\nTelefone: "+Telefone+
             "\nFita Alugada: "+FitaAlugada+"\nTempo Alugado: "+TempoAlugado);
     
    }
    
}