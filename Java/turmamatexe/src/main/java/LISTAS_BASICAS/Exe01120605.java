
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

/*
12.Faça um programa para cadastrar um professor com os seguintes dados, Nome, 
endereço, cidade, UF, CEP, telefone, CPF, carteira de identidade, 
data de nascimento, grau de escolaridade e curso que leciona. 
No final mostrar todos os dados de uma forma organizada.
*/

public class Exe01120605 {
    
    public static void main(String[] args) {
        
        String Nome = JOptionPane.showInputDialog("Informe o nome: ");
        String Endereco = JOptionPane.showInputDialog("Informe o endereço: ");
        String Cidade = JOptionPane.showInputDialog("Informe a cidade: ");
        String UF = JOptionPane.showInputDialog("Informe a UF: ");
        int CEP = Integer.parseInt(JOptionPane.showInputDialog("Informe o CEP: "));
        long Telefone = Long.parseLong(JOptionPane.showInputDialog("Informe o telefone: "));
        long CPF = Long.parseLong(JOptionPane.showInputDialog("Informe o CPF: "));
        int RG = Integer.parseInt(JOptionPane.showInputDialog("Informe o RG: "));
        String DataNasc = JOptionPane.showInputDialog("Informe a data de nascimento: ");
        String GrauEscola = JOptionPane.showInputDialog("Informe o grau de escolaridade: ");
        String Curso = JOptionPane.showInputDialog("Informe o curso lecionado: ");
        
        JOptionPane.showMessageDialog(null,"Nome: "+Nome+"\nEndereço: "+Endereco+
                "\nCidade: "+Cidade+"\nUF: "+UF+"\nCEP: "+CEP+"\nTelefone: "
                +Telefone+"\nCPF: "+CPF+"\nRG: "+RG+"\nData Nascimento: "+DataNasc+
                "\nGrau de Escolaridade: "+GrauEscola+"\nCurso lecionado: "+Curso);
    }
}
