package exercicios;

import java.util.Scanner;

public class Exercicio227 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira N: ");
        int n = input.nextInt();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            if(i % 2 == 0){
                System.out.print("\n ");
            }else{
                System.out.print("\n");
            }
        }
    }
}
