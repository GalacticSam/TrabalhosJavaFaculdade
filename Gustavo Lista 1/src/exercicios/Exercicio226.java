package exercicios;

import java.util.Scanner;

public class Exercicio226 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira N1: ");
        int n1 = input.nextInt();
        System.out.print("Insira N2: ");
        int n2 = input.nextInt();
        
        if (n1 % n2 == 0){
            System.out.println("É multiplo");
        }else{
            System.out.println("Não é multiplo");
        }
    }
}
