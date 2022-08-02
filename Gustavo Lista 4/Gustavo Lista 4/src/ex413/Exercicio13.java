package ex413;

import java.util.Scanner;

public class Exercicio13 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.print("Insira o numero de strings a serem processadas: ");
        n = input.nextInt();
        
        String[] l = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Insira o "+ (i + 1) + " texto a ser processado: ");
            input.useDelimiter("\n");
            l[i] = input.next();
            if(l[i].length() > 14) {
                l[i] = l[i].substring(0, 14);
            }
        }
        
        char[][] charArr = new char[n][14];
        
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = l[i].toCharArray();
        }
        
        int soma = 0;
        
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                if( charArr[i][j] >= 48 && charArr[i][j] <= 57 ) {
                    soma = soma + (int) (charArr[i][j] - 48);
                }
            }
            System.out.println("A soma dos inteiros na linha " + (i + 1) + " é: " + soma);
            soma = 0;
        }
        input.close();
    }
}
