package ex409;

import java.util.Scanner;

public class QuadradoMagico {
    public static void main(String[] args) {
        int[][] qm = new int[4][4];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < qm.length; i++) {
            for (int j = 0; j < qm[i].length; j++) {
                qm[i][j] = input.nextInt();
            }
        }

        System.out.println(checarQuadrado(qm));
        
        input.close();
    }

    public static boolean checarQuadrado(int[][] array) {
        int soma = 0;
        for (int i = 0; i < array[0].length; i++) {
            soma += array[0][i];
        }

        for (int i = 0; i < array.length; i++) {
            int somaTemp = 0;
            for (int j = 0; j < array[i].length; j++) {
                somaTemp += array[i][j];
            }
            if (somaTemp != soma) {
                return false;
            }
        }

        for (int i = 0; i < array.length; i++) {
            int somaTemp = 0;
            for (int j = 0; j < array[i].length; j++) {
                somaTemp += array[j][i];
            }   
            if (somaTemp != soma) {
                return false;
            }
        }

        int somaTemp = 0;
        for (int i = 0; i < array.length; i++) {
            somaTemp += array[i][i];   
        }
        if (somaTemp != soma) {
            return false;
        }

        return true;
    }
}
