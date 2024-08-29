
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
09)Faça um programa de uma conta de luz, onde será informado quanto que o usuário 
consumiu, regras:
a - Se usuário Residencial será cobrado 0.871 por kw/h
b - Se usuário Comercial será cobrado 0.999 por kw/h
c - Mostrar Nome, número do usuário, se é comercial ou residencial, quanto gastou em kw/h e 
quanto a ser pago.
*/

public class Exe03150805 {
    
    public static void main(String[] args) {
        
        String NomeUsuario = JOptionPane.showInputDialog("Informe seu nome de usuário: ");
        String Nome = JOptionPane.showInputDialog("Informe seu nome: ");
        float Consumo = Float.parseFloat(JOptionPane.showInputDialog("Informe o consumo: "));
        float VlrPagar;
        int Tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo:\n\n[1] - Residencial\n[2] - Comercial"
                + "\n\nEscolha sua opção: "));
        
        if (Tipo == 1){
            VlrPagar = Consumo * 0.871f; 
            JOptionPane.showMessageDialog(null,"Nome Usuário: "+NomeUsuario+
                    "\nNome: "+Nome+"\nConsumo: "+Consumo+"\nValor a se pagar: R$"+VlrPagar);
        }else if (Tipo == 2){
            VlrPagar = Consumo * 0.999f;
            JOptionPane.showMessageDialog(null,"Nome Usuário: "+NomeUsuario+
                    "\nNome: "+Nome+"\nConsumo: "+Consumo+"\nValor a se pagar: R$"+VlrPagar);            
        }else{
            JOptionPane.showMessageDialog(null,"Não tem essa opção!");
        }
        
    }
    
}
