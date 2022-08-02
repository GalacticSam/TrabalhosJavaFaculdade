package exercicios;

import java.util.Scanner;

public class Exercicio217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserir N1: ");
        int n1 = input.nextInt();
        System.out.print("Inserir N2: ");
        int n2 = input.nextInt();
        System.out.print("Inserir N3: ");
        int n3 = input.nextInt();
        
        System.out.println("Soma: " + (n1 + n2 + n3));
        System.out.println("Media: " + (n1 + n2 + n3)/3);
        System.out.println("Produto: " + n1 * n2 * n3);
        
        int maior = 0;
        int menor = 0;
        
        if (n1 >= n2){
            if(n2 >= n3){
                maior = n1;
                menor = n3;
            }else if(n1 >= n3){
                maior = n1;
                menor = n2;
            }else{
                maior = n3;
                menor = n2;
            }
        }else if (n2 > n1){
            if(n1 >= n3){
                maior = n2;
                menor = n3;
            }else if(n2 >= n3){
                maior = n2;
                menor = n1;
            }else{
                maior = n3;
                menor = n1;
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
