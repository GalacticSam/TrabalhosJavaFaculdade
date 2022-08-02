package ex414;

import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        
        System.out.print("Insira a sentença: ");
        String frase = input.next();
        
        String[] split = frase.split("\\s+");
        
        char[][] charArr = new char[split.length][];
        
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = split[i].toCharArray();
        }
        
        char temp;
        
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length / 2; j++) {
                temp = charArr[i][j];
                charArr[i][j] = charArr[i][(charArr[i].length - 1) - j];
                charArr[i][(charArr[i].length - 1) - j] = temp;
            }
        }
        
        for (int i = 0; i < charArr.length; i++) {
            split[i] = String.valueOf(charArr[i]);
            System.out.print(split[i] + " ");
        }
        
        input.close();
    }
}
