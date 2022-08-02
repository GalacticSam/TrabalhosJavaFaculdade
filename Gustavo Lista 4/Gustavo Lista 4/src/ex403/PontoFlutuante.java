package ex403;

import java.util.Scanner;

public class PontoFlutuante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] pf = new double[10];
        
        for (int i = 0; i < pf.length; i++) {
            pf[i] = input.nextDouble();
        }

        double media = calculoMedia(pf);

        double variancia = calculoVariancia(pf, media);

        double desvioP = calculoDesvioPadrao(variancia);


        System.out.println(media + " " + variancia + " " + desvioP);

        input.close();
    }

    private static double calculoDesvioPadrao(double variancia) {
        return Math.sqrt(variancia);
    }

    private static double calculoVariancia(double[] pf, double media) {
        double somaVar = 0;

        for (int i = 0; i < pf.length; i++) {
            somaVar += Math.pow(pf[i] - media, 2);
        }

        return somaVar/pf.length;
    }

    private static double calculoMedia(double[] pf) {
        double soma = 0;

        for (int i = 0; i < pf.length; i++) {
            soma += pf[i];
        }

        return soma/pf.length;
    }
}
