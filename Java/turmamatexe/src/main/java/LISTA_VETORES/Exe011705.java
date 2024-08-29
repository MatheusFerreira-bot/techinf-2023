package LISTA_VETORES;

import javax.swing.JOptionPane;

/*
001 - Faça um programa com procedimentos e funções e principalmente um
menu para chamar cada fase do projeto e que mostre os resultados de pesos de
1000 pessoas. Mostrando: Nome, Peso, Status(de acordo com a tabela de imc).
*/

public class Exe011705 {
    
    public static void main(String[] args) {
        
        int i = 0;
        String Nome [] = new String[3];
        String Status[] = new String[Nome.length], Classificacao = "";
        Float Altura[] = new Float[Nome.length],Peso[] = new Float[Nome.length],IMC[] = new Float[Nome.length];
        int QuantAb = 0, QuantId = 0, QuantAc = 0, QuantOb1 = 0, QuantOb2 = 0, QuantOb3 = 0, TotalObesidade = 0;
        String NomeAb[] = new String[Nome.length], NomeId[] = new String[Nome.length], NomeAc[] = new String[Nome.length],
        NomeOb1[] = new String[Nome.length], NomeOb2[] = new String[Nome.length], NomeOb3[] = new String[Nome.length];     
        float SomaPesos = 0f,MediaPesos = 0f, SomaAb = 0, SomaId = 0, SomaAc = 0, SomaOb1 = 0, SomaOb2 = 0, SomaOb3 = 0;
        float MediaAb = 0f, MediaId = 0f, MediaAc = 0f, MediaOb1 = 0f, MediaOb2 = 0f, MediaOb3 = 0f, SomaMedias = 0f,MediaMedias = 0f;
        float MaiorPesoAb = Float.MIN_VALUE, MenorPesoAb = Float.MAX_VALUE;
        float MaiorPesoId = Float.MIN_VALUE, MenorPesoId = Float.MAX_VALUE;
        float MaiorPesoAc = Float.MIN_VALUE, MenorPesoAc = Float.MAX_VALUE;
        float MaiorPesoOb1 = Float.MIN_VALUE, MenorPesoOb1 = Float.MAX_VALUE;
        float MaiorPesoOb2 = Float.MIN_VALUE, MenorPesoOb2 = Float.MAX_VALUE;
        float MaiorPesoOb3 = Float.MIN_VALUE, MenorPesoOb3 = Float.MAX_VALUE;
        int Opcao = 0;
        
        do{
            Opcao = Integer.parseInt(JOptionPane.showInputDialog("Cálculo IMC:\n\n[ 1 ] - Inserção dos dados"
                + "\n[ 2 ] - Ficha IMC\n[ 3 ] - Quantidade categorias\n[ 4 ] - Médias\n[ 5 ] - Maior e menor peso por categorias"
                + "\n[ 6 ] - Categoria com maior quantidade\n[ 0 ] Sair\n\nInforme: "));
                
            switch(Opcao){
                
                case 0:
                    JOptionPane.showMessageDialog(null,"Volte sempre!");
                    break;
                    
                case 1:
                    for (i = 0; i < Nome.length; i++) {
                        Nome[i] = JOptionPane.showInputDialog("Informe o nome: ");
                        Altura[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
                        Peso[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso: "));
                        IMC[i] = Peso[i] / (Altura[i] * Altura[i]);   
                        SomaPesos += Peso[i];

                        if (IMC[i] < 18.5){
                            Status[i] = "Abaixo do peso";
                            QuantAb++;
                            NomeAb[i] = Nome[i];
                            SomaAb += Peso[i];
                            if (Peso[i] > MaiorPesoAb){
                                MaiorPesoAb = Peso[i];
                            }
                            if (Peso[i] < MenorPesoAb){
                                MenorPesoAb = Peso[i];
                            }
                        }else if (IMC[i] < 25){
                            Status[i] = "Peso ideal (Parabéns)";
                            QuantId++;
                            NomeId[i] = Nome[i];
                            SomaId += Peso[i];
                            if (Peso[i] > MaiorPesoId){
                                MaiorPesoId = Peso[i];
                            }
                            if (Peso[i] < MenorPesoId){
                                MenorPesoId = Peso[i];
                            }                
                        }else if (IMC[i] < 30){
                            Status[i] = "Levemente acima do peso";
                            QuantAc++;
                            NomeAc[i] = Nome[i];
                            SomaAc += Peso[i];
                            if (Peso[i] > MaiorPesoAc){
                                MaiorPesoAc = Peso[i];
                            }
                            if (Peso[i] < MenorPesoAc){
                                MenorPesoAc = Peso[i];
                            } 
                        }else if (IMC[i] < 35){
                            Status[i] = "Obesidade grau 1";
                            QuantOb1++;
                            NomeOb1[i] = Nome[i];
                            SomaOb1 += Peso[i];
                            if (Peso[i] > MaiorPesoOb1){
                                MaiorPesoOb1 = Peso[i];
                            }
                            if (Peso[i] < MenorPesoOb1){
                                MenorPesoOb1 = Peso[i];
                            }
                        }else if (IMC[i] < 40){
                            Status[i] = "Obesidade grau 2 (Severa)";
                            QuantOb2++;
                            NomeOb2[i] = Nome[i];
                            SomaOb2 += Peso[i];
                            if (Peso[i] > MaiorPesoOb2){
                                MaiorPesoOb2 = Peso[i];
                            }
                            if (Peso[i] < MenorPesoOb2){
                                MenorPesoOb2 = Peso[i];
                            }
                        }else{
                            Status[i] = "Obesidade grau 3 (Mórbida)";
                            QuantOb3++;
                            NomeOb3[i] = Nome[i];
                            SomaOb3 += Peso[i];
                            if (Peso[i] > MaiorPesoOb3){
                                MaiorPesoOb3 = Peso[i];
                            }
                            if (Peso[i] < MenorPesoOb3){
                                MenorPesoOb3 = Peso[i];
                            }
                        }            
                    }
                    break;
                    
                case 2: 
                    String AlunoPesquisa = JOptionPane.showInputDialog("Informe o nome do aluno:");
                    boolean AlunoEncontrado = false;
                    for (i = 0; i < Nome.length; i++) {
                        if (AlunoPesquisa.equals(Nome[i])) {
                            JOptionPane.showMessageDialog(null,"Nome: "+Nome[i]+"\nAltura: "+Altura[i]+"\nPeso: "+Peso[i]+
                            "\nIMC: "+IMC[i]+"\n\nStatus: "+Status[i]);
                            AlunoEncontrado = true;
                            break; // Interrompe o loop após encontrar o aluno
                        }
                     }
                     if(!AlunoEncontrado){
                        JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
                    }                    
                    break;
                    
                case 3:
                    if (QuantAb > 0){
                    }else{
                        QuantAb = 0;
                    }
                    
                    if (QuantId > 0){
                    }else{
                        QuantId = 0;
                    }
                    
                    if (QuantAc > 0){
                    }else{
                        QuantAc = 0;
                    }
                    
                    if (QuantOb1 > 0){
                    }else{
                        QuantOb1 = 0;
                    }
                    
                    if (QuantOb2 > 0){
                    }else{
                        QuantOb2 = 0;
                    }
                    
                    if (QuantOb3 > 0){
                    }else{
                        QuantOb3 = 0;
                    }
                    
                    JOptionPane.showMessageDialog(null,"Quantidade abaixo do peso: "+QuantAb+"\nQuantidade peso ideal: "+QuantId+
                            "\nQuantidade acima do peso: "+QuantAc+"\nQuantidade obesidade grau 1: "+QuantOb1+"\n"
                                    + "Quantidade obesidade grau 2: "+QuantOb2+"\nQuantidade obesidade grau 3: "+QuantOb3);
                    break;
                    
                case 4:    
                    MediaPesos = SomaPesos / i;
                    SomaMedias = SomaAb + SomaId + SomaAc + SomaOb1 + SomaOb2+ SomaOb3;
                    MediaMedias = SomaMedias / 6;
                    TotalObesidade = QuantOb1 + QuantOb2 + QuantOb3;
                    
                    if (QuantAb > 0){
                        MediaAb = SomaAb / QuantAb;
                    }else{
                        MediaAb = 0;
                    }
                    
                    if (QuantId > 0){
                        MediaId = SomaId / QuantId;
                    }else{
                        MediaId = 0;
                    }
                    
                    if (QuantAc > 0){
                        MediaAc = SomaAc / QuantAc;
                    }else{
                        MediaAc = 0;
                    }
                    
                    if (QuantOb1 > 0){
                        MediaOb1 = SomaOb1 / QuantOb1;
                    }else{
                        MediaOb1 = 0;
                    }
                    
                    if (QuantOb2 > 0){
                        MediaOb2 = SomaOb2 / QuantOb2;
                    }else{
                        MediaOb2 = 0;
                    }
                    
                    if (QuantOb3 > 0){
                        MediaOb3 = SomaOb3 / QuantOb3;
                    }else{
                        MediaOb3 = 0;
                    }
                    JOptionPane.showMessageDialog(null,"Média dos pesos: "+MediaPesos+"\nMédia abaixo do peso: "
                            +MediaAb+"\nMédia peso ideal: "+MediaId+"\nMédia acima do peso: "+MediaAc+"\nMédia obesidade grau 1: "
                            +MediaOb1+"\nMédia obesidade grau 2: "+MediaOb2+"\nMédia obesidade grau 3: "+MediaOb3+
                            "\n\nMédia das médias: "+MediaMedias+"\nTotal obesidades: "+TotalObesidade);               
                    break;
                    
                case 5:    
                    if (QuantAb > 0){
                    }else{
                        MaiorPesoAb = 0;
                        MenorPesoAb = 0;
                    }
                     
                    if (QuantId > 0){
                    }else{
                        MaiorPesoId = 0;
                        MenorPesoId = 0;
                    }
                     
                    if (QuantAc > 0){
                    }else{
                        MaiorPesoAc = 0;
                        MenorPesoAc = 0;
                    }
                     
                    if (QuantOb1 > 0){
                    }else{
                        MaiorPesoOb1 = 0;
                        MenorPesoOb1 = 0;
                    }
                     
                    if (QuantOb2 > 0){
                    }else{
                        MaiorPesoOb2 = 0;
                        MenorPesoOb2 = 0;
                    }
                    
                    if (QuantOb3 > 0){
                    }else{
                        MaiorPesoOb3 = 0;
                        MenorPesoOb3 = 0;
                    }
                    JOptionPane.showMessageDialog(null,"Abaixo do peso:\nMaior peso: "+MaiorPesoAb+"\nMenor Peso: "+MenorPesoAb+
                            "\n\nPeso ideal:\nMaior peso: "+MaiorPesoId+"\nMenor peso: "+MenorPesoId+"\n\nAcima do peso:"
                            + "\nMaior peso: "+MaiorPesoAc+"\nMenor peso: "+MenorPesoAc+"\n\nObesidade grau 1:\n"
                            + "Maior peso: "+MaiorPesoOb1+"\nMenor peso: "+MenorPesoOb1+"\n\nObesidade grau 2:"
                            + "\nMaior peso: "+MaiorPesoOb2+"\nMenor peso: "+MenorPesoOb2+"\n\nObesidade grau 3:"
                            + "\nMaior peso: "+MaiorPesoOb3+"\nMenor peso: "+MenorPesoOb3);
                    break;
                    
                case 6:
                    if (QuantAb > QuantId && QuantAb > QuantAc && QuantAb > QuantOb1 && QuantAb > QuantOb2 && QuantAb > QuantOb3){
                        Classificacao = "Houve mais pessoas abaixo do peso";
                    }else if (QuantId > QuantAb && QuantId > QuantAc && QuantId > QuantOb1 && QuantId > QuantOb2 && QuantId > QuantOb3){
                        Classificacao = "Houve mais pessoas com peso ideal";
                    }else if (QuantAc > QuantAb && QuantAc > QuantId && QuantAc > QuantOb1 && QuantAc > QuantOb2 && QuantAc > QuantOb3){
                        Classificacao = "Houve mais pessoas acima do peso";
                    }else if (QuantOb1 > QuantAb && QuantOb1 > QuantId && QuantOb1 > QuantAc && QuantOb1 > QuantOb2 && QuantOb1 > QuantOb3){
                        Classificacao = "Houve mais pessoas com obesidade grau 1";
                    }else if (QuantOb2 > QuantAb && QuantOb2 > QuantId && QuantOb2 > QuantAc && QuantOb2 > QuantOb1 && QuantOb2 > QuantOb3){
                        Classificacao = "Houve mais pessoas com obesidade grau 2";
                    }else if (QuantOb3 > QuantAb && QuantOb3 > QuantId && QuantOb3 > QuantAc && QuantOb3 > QuantOb1 && QuantOb3 > QuantOb2){
                        Classificacao = "Houve mais pessoas com obesidade grau 3";
                    }else{
                        Classificacao = "As quantidades foram iguais";
                    }
                    JOptionPane.showMessageDialog(null,Classificacao);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null,"Opção inexistente.");
                    break;
            }
        }while(Opcao != 0);
    }
}