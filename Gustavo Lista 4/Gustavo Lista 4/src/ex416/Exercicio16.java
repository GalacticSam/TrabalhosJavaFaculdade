package ex416;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.print("Insira a frase: ");
        String frase = input.next();
        System.out.print("Insira o caractere a ser buscado: ");
        String check = input.next();
        
        int occ = 0;
        int pos;
        
        for (int i = 0; i < frase.length(); i++) {
            pos = frase.indexOf(check.charAt(0), i);
            if(pos > 0) {
                occ++;
                i = pos;
            }
        }

        System.out.println(occ);
        
        input.close();
    }
}
