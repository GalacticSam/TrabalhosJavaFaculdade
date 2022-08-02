package exercicios;

import java.util.Scanner;

public class Exercicio230 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira um numero de 5 digitos: ");
        int n = input.nextInt();
        
        System.out.print(n/10000 + " ");
        System.out.print((n % 10000)/1000 + " ");
        System.out.print((n % 1000)/100 + " ");
        System.out.print((n % 100)/10 + " ");
        System.out.print(n % 10 + " ");
    }
}
