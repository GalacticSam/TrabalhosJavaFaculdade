package ex407;

import java.util.Scanner;

public class VetorTroca {
    public static void main(String[] args) {
        int[] N = new int[20];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < N.length; i++) {
            N[i] = input.nextInt();
        }

        for (int i = 0; i < N.length/2; i++) {
            int temp;
            temp = N[i];
            N[i] = N[N.length-i-1];
            N[N.length-i-1] = temp;
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

        input.close();
    }
}
