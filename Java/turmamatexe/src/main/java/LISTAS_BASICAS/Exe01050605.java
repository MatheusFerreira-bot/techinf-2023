
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

//5-Faça um programa que possa entrar com o saldo de uma aplicação e mostre o novo saldo,
// mostrando o saldo anterior e o atualizado. Sendo o Saldo anterior ter sido informado e inclusive informar também o reajuste.

public class Exe01050605 {
    
    public static void main(String args []) {
        
        float SldAplic = Float.parseFloat(JOptionPane.showInputDialog("Informe o VALOR da aplicação: "));
        float SldAnt = 0F;
        float SldAtual = SldAplic + SldAnt;
        
        JOptionPane.showMessageDialog(null,"O saldo anterior: "+SldAnt);
        SldAnt = SldAtual;
        JOptionPane.showMessageDialog(null,"O valor da aplicação: "+SldAplic+"\nO saldo atual: "+SldAtual);
    }
}