package ex421;

import java.util.Scanner;

public class UsaPonto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        double tempX, tempY;

        System.out.print("Insira X do primeiro ponto: ");
        tempX = input.nextDouble();

        System.out.print("Insira Y do primeiro ponto: ");
        tempY = input.nextDouble();

        Ponto p1 = new Ponto(tempX, tempY);
        
        System.out.print("Insira X do segundo ponto: ");
        tempX = input.nextDouble();

        System.out.print("Insira Y do segundo ponto: ");
        tempY = input.nextDouble();

        Ponto p2 = new Ponto(tempX, tempY);
        
        System.out.println("Ponto 1 é:" + p1 + "\nPonto 2 é: " + p2);
        System.out.println("A distancia entre esses dois pontos é: " + p1.calcularDistancia(p2));

        input.close();
    }
}
