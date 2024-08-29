package LISTA_WHILE;

import javax.swing.JOptionPane;

/*
3.Escreva um programa que determine e imprima todos os números primos entre dois números fornecidos pelo usuário.
 */

import javax.swing.JOptionPane;

public class Exe01031405 {

    public static void main(String[] args) {

        int N1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o início: "));
        int N2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o fim: "));

        // Inicializamos o número a ser verificado como o menor número do intervalo
        int numeroAtual = N1;

        // Loop enquanto o número atual estiver dentro do intervalo fornecido
        while (numeroAtual <= N2) {
            
            // Verificamos se o número atual é primo
            boolean primo = true; // Assumimos inicialmente que o número é primo
            int divisor = 2; // Começamos a divisão a partir de 2
            
            // Enquanto não encontrarmos um divisor e o divisor for menor ou igual à metade do número atual
            while (divisor <= numeroAtual / 2) {
                
                // Se encontrarmos um divisor, marcamos que o número não é primo
                if (numeroAtual % divisor == 0) {
                    primo = false;
                    break; // Não precisamos continuar a verificar divisores se já encontramos um
                }
                divisor++; // Passamos para o próximo divisor
            }
            
            // Se o número for primo, exibimos-o
            if (primo) {
                JOptionPane.showMessageDialog(null, numeroAtual);
            }
            numeroAtual++; // Passamos para o próximo número do intervalo
        }
    }
}