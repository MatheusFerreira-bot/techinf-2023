
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
05) Fazer um programa que leia 3 valores e verifique se é possível formar
triangulo (para formar triangulo nenhum valor pode ser maior que a soma dos demais)
*/

public class Exe03060805 {
    
    public static void main(String args[]) {
        
        float L1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro lado: "));
        float L2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo lado: "));
        float L3 = Float.parseFloat(JOptionPane.showInputDialog("Informe o terceiro lado: "));
        
        if (L1 + L2 > L3 & L1 + L3 > L2 & L2 + L3 > L1){
            JOptionPane.showMessageDialog(null,"Pode ser um triângulo!");
        }else{
            JOptionPane.showMessageDialog(null,"Não pode ser um triângulo!");
        }
    }
}
