package ex401;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        
        System.out.println("O maior numero é " + Math.max(Math.max(n1, n2), n3));

        input.close();
    }
}