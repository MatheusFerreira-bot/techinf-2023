
package LISTA_IF_E_SWITCH;

import javax.swing.JOptionPane;

/*
9. Desenvolva um programa que classifique um triângulo como equilátero, isósceles
ou escaleno, com base nos tamanhos de seus lados.
*Um triângulo é chamado de equilátero se todos os lados possuem a mesma medida.
*Um triângulo é chamado de isósceles se dois lados possuem a mesma medida.
*Um triângulo é chamado de escaleno se todos os lados possuem medidas diferentes.
*/

public class Exe04091005 {
    public static void main(String args []){
        
        float Lado1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro lado: "));
        float Lado2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo lado: "));
        float Lado3 = Float.parseFloat(JOptionPane.showInputDialog("Informe o terceiro lado: "));
        
        if (Lado1 == Lado2 && Lado1 == Lado3){
            JOptionPane.showMessageDialog(null,"É um equilátero");
        }else if (Lado1 == Lado2 || Lado1 == Lado3 || Lado2 == Lado3){
            JOptionPane.showMessageDialog(null,"É um isósceles");
        }else{
            JOptionPane.showMessageDialog(null,"É um escaleno");
        }
        
    }
     
}