package ex405;

import java.util.Scanner;

public class SubstituicaoVetor {
    public static void main(String[] args) {
        int[] X = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < X.length; i++) {
            X[i] = input.nextInt();
            if (X[i] < 1) {
                X[i] = 1;
            }
        }

        for (int i = 0; i < X.length; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }

        input.close();
    }
}