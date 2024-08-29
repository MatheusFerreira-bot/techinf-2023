
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;

/*
 07) Fazer um algoritmo que leia o consumo médio em metros cúbicos de água de
 um cliente e o tipo de cliente (comercial R$ 2,84 o metro cúbico ou
 residencial R$ 2,68 o metro cúbico) O algoritmo deverá retornar o valor da
 conta.
*/

public class Exe03080805 {
    
    public static void main(String args []) {
        
        float Consumo = Float.parseFloat(JOptionPane.showInputDialog("Informe seu consumo médio: "));
        float Comercial = Consumo * 2.84F;
        float Residencial = Consumo * 2.68F;
        
        int TipoCliente = Integer.parseInt(JOptionPane.showInputDialog("Informe seu tipo:"
                + "\n\n[1] - Comercial\n[2] - Residencial\n\nFaça sua escolha: "));
        
        if (TipoCliente == 1){
            JOptionPane.showMessageDialog(null,"O valor da sua conta foi de: R$"+Comercial);
        }else if (TipoCliente == 2){
            JOptionPane.showMessageDialog(null,"O valor da sua conta foi de: R$"+Residencial);
        }else{
            JOptionPane.showMessageDialog(null,"Não tem essa opção!");
        }
        
    }

}
