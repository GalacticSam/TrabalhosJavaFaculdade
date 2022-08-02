package ex415;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.print("Insira a primeira frase: ");
        String frase1 = input.next();
        System.out.print("Insira a segunda frase: ");
        String frase2 = input.next();
        
        int comp = frase1.compareTo(frase2);
        
        if(comp > 0) {
            System.out.println("A frase \"" + frase1 + "\" é maior do que a "
                    + "frase \"" + frase2 + "\"." );
        } else if(comp < 0){
            System.out.println("A frase \"" + frase2 + "\" é maior do que a "
                    + "frase \"" + frase1 + "\"." );
        } else {
            System.out.println("As frases são iguais.");
        }

        input.close();
    }
}
