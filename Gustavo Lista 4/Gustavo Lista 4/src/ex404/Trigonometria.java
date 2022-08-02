package ex404;

import java.util.Scanner;

public class Trigonometria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double seno = Math.round(Math.sin(Math.toRadians(n)) * 100)/100;

        double cosseno = Math.round(Math.cos(Math.toRadians(n)) * 100)/100;

        double tan = Math.round(Math.tan(Math.toRadians(n)) * 100)/100;

        double arctan = Math.round(Math.atan(Math.toRadians(n)) * 100)/100;

        System.out.println("Seno: " + seno);

        System.out.println("Cosseno: " + cosseno);

        System.out.println("Tangente: " + tan);

        System.out.println("Arco tangente: " + arctan);

        input.close();
    }
}