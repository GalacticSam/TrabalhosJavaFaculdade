package exercicios;

import java.util.Scanner;

public class Exercicio233 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira a altura em metros: ");
        double altura = input.nextDouble();
        System.out.print("Insira o peso em quilogramas: ");
        double peso = input.nextDouble();

        double IMC = peso/(altura * altura);

        System.out.println("IMC: " + IMC);
        System.out.println("BMI VALUES\nUnderweight:\tless than 18.5\nNormal:\t\tbetween 18.5 and 24.9\nOverweight:\tbetween 25 and 29.9\nObese:\t\t30 or greater");
    }
}
