package ex402;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();

        System.out.println("O valor absoluto de " + n1 + " é " + Math.abs(n1));

        input.close();
    }
}