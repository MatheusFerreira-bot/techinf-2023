
package LISTAS_IF_ELSE;

import javax.swing.JOptionPane;
    
/*
 10) Fazer um algoritmo que leia a quantidade de homens e mulheres que
 compareceram em uma festa e retorne qual teve maior quantidade e o
 percentual correspondente de cada um
*/

public class Exe03110805 {
    
    public static void main(String args[]) {
        
       int Homem = Integer.parseInt(JOptionPane.showInputDialog("Informe a QUANTIDADE de HOMENS que compareceram a festa: "));
       int Mulher = Integer.parseInt(JOptionPane.showInputDialog("Informe a QUANTIDADE de MULHERES que compareceram a festa: "));
       float TotalPessoas = Homem + Mulher;
       float PercentMulher = (Mulher / TotalPessoas) * 100f;
       float PercentHomem = (Homem / TotalPessoas) * 100f;
       
       if (Homem > Mulher){
           JOptionPane.showMessageDialog(null,"Houve mais HOMENS na festa!\n\n"
                   + "Percentual de MULHERES: "+PercentMulher+"%\n"
                           + "Percentual de HOMENS: "+PercentHomem+"%");
       }else if (Mulher > Homem){
           JOptionPane.showMessageDialog(null,"Houve mais MULHERES na festa!\n\n"
                   + "Percentual de MULHERES: "+PercentMulher+
                   "%\nPercentual de HOMENS: "+PercentHomem+"%");
       }else{
           JOptionPane.showMessageDialog(null,"Mesma quantidade!");
       }
        
    }
}