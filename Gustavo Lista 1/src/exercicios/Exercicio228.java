package exercicios;

import java.util.Scanner;

public class Exercicio228 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o raio: ");
        int r = input.nextInt();
        
        System.out.println("Diametro: " + (r * 2));
        System.out.println("Circunferencia: " + (2 * Math.PI * r));
        System.out.println("Area: " + (Math.PI * r * r));
    }
}
