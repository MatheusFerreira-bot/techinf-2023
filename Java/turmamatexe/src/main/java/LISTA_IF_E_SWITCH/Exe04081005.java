
package LISTA_IF_E_SWITCH;

import javax.swing.JOptionPane;

/*
8. Escreva um programa que leia o salário de um funcionário e calcule o valor do
aumento, considerando as seguintes condições: 10% de aumento para salários
até R$ 1500,00 e 5% de aumento para salários acima de R$ 1500,00.
*/

public class Exe04081005 {
    public static void main(String args []) {
        
        float Salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário: "));
        float Aumento;
        
        if (Salario <= 1500){
            Aumento = Salario + (Salario * 0.10f);
        }else{
            Aumento = Salario + (Salario * 0.05f);
        }
        
        JOptionPane.showMessageDialog(null,"Salário: "+Salario+"\nReajuste: "+Aumento);
        
    }
    
}
