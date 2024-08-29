
package LISTAS_BASICAS;

import javax.swing.JOptionPane;

public class Exe02050705_Disciplinas {
    
    public static void main(String args[]) {
        
    String Aluno = JOptionPane.showInputDialog("Informe o NOME do ALUNO: ");
    String Serie = JOptionPane.showInputDialog("Informe a SÉRIE do ALUNO: ");
    String Turno = JOptionPane.showInputDialog("Informe o TURNO: ");
    String Semestre = JOptionPane.showInputDialog("Informe o SEMESTRE: ");
    String Turma = JOptionPane.showInputDialog("Informe a TURMA: ");
    String Disciplina = JOptionPane.showInputDialog("Informe a DISCIPLINA: ");
     
    JOptionPane.showMessageDialog(null,"Aluno: "+Aluno+"\nSerie: "+Serie+
            "\nTurno: "+Turno+"\nSemestre: "+Semestre+"\nTurma: "+Turma+
            "\nDisciplina: "+Disciplina);
             
    }
    
}