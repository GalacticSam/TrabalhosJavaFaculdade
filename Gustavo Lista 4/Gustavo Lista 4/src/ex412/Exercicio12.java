package ex412;

import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        
        System.out.print("Insira a sentença: ");
        String frase = input.next();
        
        frase = frase.toUpperCase();
        char[] fraseC = frase.toCharArray();
        
        int contador = 0;
        
        for (int i = 0; i < fraseC.length; i++) {
            if (fraseC[i] != ' ') {   
                if (contador % 2 == 0) {
                    contador++;
                    fraseC[i] = Character.toUpperCase(fraseC[i]);
                } else {
                    contador++;
                    fraseC[i] = Character.toLowerCase(fraseC[i]);
                }
            }
        }
        
        frase = String.valueOf(fraseC);
        
        System.out.println(frase);
        
        input.close(); 
    }
}
