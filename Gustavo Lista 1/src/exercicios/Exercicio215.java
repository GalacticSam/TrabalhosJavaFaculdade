package exercicios;

import java.util.Scanner;

public class Exercicio215 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserir N1: ");
        int n1 = input.nextInt();
        System.out.print("Inserir N2: ");
        int n2 = input.nextInt();
        
        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Multiplicaçao: " + n1 * n2);
        System.out.println("Subtraçao: " + (n1 - n2));
        System.out.println("Divisao: " + n1 / n2);
    }
    
}
