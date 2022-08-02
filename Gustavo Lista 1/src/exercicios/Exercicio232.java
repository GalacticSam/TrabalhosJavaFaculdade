package exercicios;

import java.util.Scanner;

public class Exercicio232 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int [] n = new int[5];
        
        int menor = 0;
        int igual = 0;
        int maior = 0;
        
        for(int i = 0; i < 5; i++){
            System.out.print("Inserir N" + (i + 1) + ": ");
            n[i] = input.nextInt();
            if (n[i] > 0){
                maior++;
            }else if (n[i] < 0){
                menor++;
            }else{
                igual++;
            }
        }
        
        System.out.println("Maiores: " + maior);
        System.out.println("Iguais: " + igual);
        System.out.println("Menores: " + menor);
    }
}
