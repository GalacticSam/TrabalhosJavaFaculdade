package ex408;

import java.util.Scanner;

public class MenorVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] X = new int[n];
        int menor = 1000;
        int posicao = 0;

        for (int i = 0; i < X.length; i++) {
            X[i] = input.nextInt();
            if(X[i] < menor){
                menor = X[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);

        input.close();        
    }
}
