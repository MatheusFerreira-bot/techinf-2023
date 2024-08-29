
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

public class Exe02050705_Passagem {
    
    public static void main(String args[]) {
        
    String Contrato = JOptionPane.showInputDialog("Informe o CONTRATO: ");
    float NumReserva = Float.parseFloat(JOptionPane.showInputDialog("Informe o NÚMERO DA RESERVA: "));
    String Voo = JOptionPane.showInputDialog("Informe o VOO: ");
    String Passageiro = JOptionPane.showInputDialog("Informe o NOME DO PASSAGEIRO: ");
    String CiaAerea = JOptionPane.showInputDialog("Informe a CIA AÉREA: ");
    float TotalCompra = Float.parseFloat(JOptionPane.showInputDialog("Informe o TOTAL DA PASSAGEM: "));
        
    JOptionPane.showMessageDialog(null,"----- PASSAGEM AÉREA -----\n\nContrato: "+Contrato
            +"\nNúmero da Reserva: "+NumReserva+"\nVoo: "+Voo+"\nPassageiro: "+
            Passageiro+"\nCia Aérea: "+CiaAerea+"\n\nTotal da Compra: "+TotalCompra);
    
    }
    
}