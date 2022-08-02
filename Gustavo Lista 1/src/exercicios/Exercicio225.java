package exercicios;

import java.util.Scanner;

public class Exercicio225 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira um numero: ");
        int n = input.nextInt();
        
        if (n % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("Nao é par");
        }
    }
}
