package exercicios;

import java.util.Scanner;

public class Exercicio216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserir N1: ");
        int n1 = input.nextInt();
        System.out.print("Inserir N2: ");
        int n2 = input.nextInt();
        
        if (n1 > n2){
            System.out.println(n1 + " is larger");
        }else if (n2 > n1){
            System.out.println(n2 + " is larger");
        }else{
            System.out.println("These numbers are equal");
        }
    }
}
