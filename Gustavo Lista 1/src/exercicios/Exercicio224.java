package exercicios;

import java.util.Scanner;

public class Exercicio224 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //int n[5];
        int [] n = new int[5];
        
        for(int i = 0; i < 5; i++){
            System.out.print("Inserir N" + (i + 1) + ": ");
            n[i] = input.nextInt();
        }
        
        int maior = n[0];
        int menor = n[0];
        
        for(int i = 0; i < 5; i++){
            if (n[i] > maior){
                maior = n[i];
            }
            if (n[i] < menor){
                menor = n[i];
            }
        }
        
        /*
        if(n[0] > n[1] && n[0] > n[2] && n[0] > n[3] && n[0] > n[4]){
            maior = n[0];
        }else if(n[1] > n[2] && n[1] > n[3] && n[1] > n[4]){
            maior = n[1];
        }else if(n[2] > n[3] && n[2] > n[4]){
            maior = n[2];
        }else if(n[3] > n[4]){
            maior = n[3];
        }else{
            maior = n[4];
        }
        
        if(n[0] < n[1] && n[0] < n[2] && n[0] < n[3] && n[0] < n[4]){
            menor = n[0];
        }else if(n[1] < n[2] && n[1] < n[3] && n[1] < n[4]){
            menor = n[1];
        }else if(n[2] < n[3] && n[2] < n[4]){
            menor = n[2];
        }else if(n[3] < n[4]){
            menor = n[3];
        }else{
            menor = n[4];
        }*/
        
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
