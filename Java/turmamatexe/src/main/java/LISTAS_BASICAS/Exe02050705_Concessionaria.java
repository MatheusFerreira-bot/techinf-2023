
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

public class Exe02050705_Concessionaria {
    
    public static void main(String[] args) {
        
     int IdVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do VEÍCULO"));
     String Fabricante = JOptionPane.showInputDialog("Informe o FABRICANTE: ");
     String Modelo = JOptionPane.showInputDialog("Informe o MODELO: ");
     String Cor = JOptionPane.showInputDialog("Informe a COR: ");
     String AnoFab = JOptionPane.showInputDialog("Informe o ANO de FABRICAÇÃO: ");
     String Placa = JOptionPane.showInputDialog("Informe a PLACA: ");
             
     JOptionPane.showMessageDialog(null,"ID Veículo: "+IdVeiculo+"\nFabricante: "+
             Fabricante+"\nModelo: "+Modelo+"\nCor: "+Cor+"\nAno Fabricação: "+
             AnoFab+"\nPlaca: "+Placa);
     
    }
    
}
