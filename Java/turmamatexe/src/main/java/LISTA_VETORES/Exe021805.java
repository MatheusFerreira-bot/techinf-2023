package LISTA_VETORES;

import javax.swing.JOptionPane;

/*
Expectativa de uma ótima semana temos aqui um situação problema para resolver,
faça um programa para solucionar uma média de 3 notas de um aluno, onde para ser aprovado
deverá o aluno alcançar a nota igual ou maior que 7, reprovação menor que 5 e 
recuperação entre seis e sete. Além de mostrar o status, aprovado, reprovado e recuperação
também vejam abaixo as necessidades deste programa.

- nome do aluno - média - aprovado - reprovado  - recuperação
- Quantidade de alunos aprovados - Quantidade de alunos reprovados
- Quantidade de alunos recuperação - Média de notas acima de 7
- Média de notas abaixo de 6    - Média de notas de recuperação
   
- Maior nota dos aprovados   - Menor nota do aprovados
- Maior nota dos reprovados  - Menor nota do reprovados
- Maior nota dos recuperação - Menor nota do recuperação
  
- Maior média dos aprovados  - Menor média dos reprovados
- Maior média dos recuperação
*/

public class Exe021805 {
    
    public static void main(String[] args) {
        
        int i = 0, Opcao = 0;
        String Nome[] = new String[2];
        String Status[] = new String[Nome.length];
        Float N1[] = new Float[Nome.length], N2[] = new Float[Nome.length], N3[] = new Float[Nome.length];
        Float Media[] = new Float[Nome.length];
        int QuantAp = 0, QuantRep = 0, QuantRec = 0;
        float SomaMediaAp = 0f, SomaMediaRep = 0f, SomaMediaRec = 0f, MediaAp = 0f, MediaRep = 0f, MediaRec = 0f;
        float MaiorNotaAp = 6.99f, MenorNotaAp = 11f, MaiorMediaAp = 6.99f, MenorMediaAp = 11f;
        float MaiorNotaRep = -1f, MenorNotaRep = 6f, MaiorMediaRep = -1f, MenorMediaRep = 6f;
        float MaiorNotaRec = 5.99f, MenorNotaRec = 7f, MaiorMediaRec = 5.99f, MenorMediaRec = 7f;
        
        do{
            Opcao = Integer.parseInt(JOptionPane.showInputDialog("Média de notas:\n\n[ 1 ] - Inserção de dados\n[ 2 ] - Boletim aluno"
                    + "\n[ 3 ] - Quantidade de Aprovados/Recuperação/Reprovados\n[ 4 ] - Média Aprovados/Recuperação/Reprovados"
                    + "\n[ 5 ] - Maior e menor nota\n[ 6 ] - Maior média Aprovados/Recuperação/Reprovados\n[ 0 ] - Sair\n\nInforme: "));
            
            switch (Opcao){
                
                case 0:
                    JOptionPane.showMessageDialog(null,"Volte sempre!");
                    break;
                    
                case 1:
                    for (i = 0; i < Nome.length; i++) {
                        Nome[i] = JOptionPane.showInputDialog("Informe o nome: ");
                        N1[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: "));
                        N2[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: "));
                        N3[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota: "));
                        Media[i] = (N1[i] + N2[i] + N3[i]) / 3f;  

                        if (Media[i] >= 7){
                            Status[i] = "Aprovado";
                            QuantAp++;
                            SomaMediaAp += Media[i];
                            if (N1[i] > MaiorNotaAp){
                                MaiorNotaAp = N1[i];
                            }
                            if (N2[i] > MaiorNotaAp){
                                MaiorNotaAp = N2[i];
                            }
                            if (N3[i] > MaiorNotaAp){
                                MaiorNotaAp = N3[i];
                            }
                            if (N1[i] < MenorNotaAp){
                                MenorNotaAp = N1[i];
                            }
                            if (N2[i] < MenorNotaAp){
                                MenorNotaAp = N2[i];
                            }
                            if (N3[i] < MenorNotaAp){
                                MenorNotaAp = N3[i];
                            }
                            if (Media[i] > MaiorMediaAp){
                                MaiorMediaAp = Media[i];
                            }
                            if (Media[i] < MenorMediaAp){
                                MenorMediaAp = Media[i];
                            }
                        }else if (Media[i] < 6){
                            Status[i] = "Reprovado";
                            QuantRep++;
                            SomaMediaRep += Media[i];
                            if (N1[i] > MaiorNotaRep){
                                MaiorNotaRep = N1[i];
                            }
                            if (N2[i] > MaiorNotaRep){
                                MaiorNotaRep = N2[i];
                            }
                            if (N3[i] > MaiorNotaRep){
                                MaiorNotaRep = N3[i];
                            }
                            if (N1[i] < MenorNotaRep){
                                MenorNotaRep = N1[i];
                            }
                            if (N2[i] < MenorNotaRep){
                                MenorNotaRep = N2[i];
                            }
                            if (N3[i] < MenorNotaRep){
                                MenorNotaRep = N3[i];
                            }  
                            if (Media[i] > MaiorMediaRep){
                                MaiorMediaRep = Media[i];
                            }
                            if (Media[i] < MenorMediaRep){
                                MenorMediaRep = Media[i];
                            }            
                        }else{
                            Status[i] = "Recuperação";
                            QuantRec++;
                            SomaMediaRec += Media[i];
                            if (N1[i] > MaiorNotaRec){
                                MaiorNotaRec = N1[i];
                            }
                            if (N2[i] > MaiorNotaRec){
                                MaiorNotaRec = N2[i];
                            }
                            if (N3[i] > MaiorNotaRec){
                                MaiorNotaRec = N3[i];
                            }
                            if (N1[i] < MenorNotaRec){
                                MenorNotaRec = N1[i];
                            }
                            if (N2[i] < MenorNotaRec){
                                MenorNotaRec = N2[i];
                            }
                            if (N3[i] < MenorNotaRec){
                                MenorNotaRec = N3[i];
                            }   
                            if (Media[i] > MaiorMediaRec){
                                MaiorMediaRec = Media[i];
                            }
                            if (Media[i] < MenorMediaRec){
                                MenorMediaRec = Media[i];
                            } 
                        }    
                    } 
                    break;
                    
                case 2:
                    String AlunoPesquisa = JOptionPane.showInputDialog("Informe o nome do aluno:");
                        boolean AlunoEncontrado = false;
                        for (i = 0; i < Nome.length; i++) {
                            if (AlunoPesquisa.equals(Nome[i])) {
                                JOptionPane.showMessageDialog(null,"Nome: "+Nome[i]+"\nNota 1: "+N1[i]+"\nNota 2: "+N2[i]+
                                        "\nNota 3: "+N3[i]+"\nMédia: " + Media[i] + "\n\nStatus: " + Status[i]);
                                AlunoEncontrado = true;
                                break; // Interrompe o loop após encontrar o aluno
                            }
                        }
                        if (!AlunoEncontrado) {
                            JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
                        }
                    break;
                        
                case 3:
                    JOptionPane.showMessageDialog(null,"Alunos aprovados: "+QuantAp+"\nAlunos em recuperação: "+QuantRec+
                            "\nAluno reprovados: "+QuantRep);
                    break;
                    
                case 4:
                    if (QuantAp > 0){
                        MediaAp = SomaMediaAp / QuantAp;
                    }else{
                        MediaAp = 0;
                    }
                    
                    if (QuantRep > 0){
                        MediaRep = SomaMediaRep / QuantRep;
                    }else{
                        MediaRep = 0;
                    }
                    
                    if (QuantRec > 0){
                        MediaRec = SomaMediaRec / QuantRec;
                    }else{
                        MediaRec = 0;
                    }
                    JOptionPane.showMessageDialog(null,"Média de aprovados: "+MediaAp+"\nMédia de recuperação: "+MediaRec+
                            "\nMedia reprovados: "+MediaRep);
                    break;
                  
                case 5: 
                    if (QuantAp > 0){
                    }else{
                        MaiorNotaAp = 0;
                        MenorNotaAp = 0;
                    }
                    
                    if (QuantRep > 0){
                    }else{
                        MaiorNotaRep = 0;
                        MenorNotaRep = 0;
                    }
                    
                    if (QuantRec > 0){
                    }else{
                        MaiorNotaRec = 0;
                        MenorNotaRec = 0;
                    }
                    JOptionPane.showMessageDialog(null,"Maior nota aprovados: "+MaiorNotaAp+"\nMenor nota aprovados: "+MenorNotaAp+
                            "\n\nMaior nota recuperação: "+MaiorNotaRec+"\nMenor nota recuperação: "+MenorNotaRec+
                            "\n\nMaior nota reprovados: "+MaiorNotaRep+"\nMenor nota reprovados: "+MenorNotaRep);
                    break;
                    
                case 6:    
                    if (QuantAp > 0){
                    }else{
                        MaiorMediaAp = 0;
                    }
                    
                    if (QuantRep > 0){
                    }else{
                        MaiorMediaRep = 0;
                    }
                    
                    if (QuantRec > 0){
                    }else{
                        MaiorMediaRec = 0;
                    }
                    JOptionPane.showMessageDialog(null,"Maior média aprovados: "+MaiorMediaAp+"\n\nMaior média recuperação: "+MaiorMediaRec+
                            "\n\nMaior média reprovados: "+MaiorMediaRep);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null,"Opção inexistente.");
                    break;
            }
        }while (Opcao != 0);
    }
}