package ex420;

import java.util.Scanner;

public class UsaRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        int lMenor;
        int lMaior;
        int temp;
        
        System.out.print("Insira a medida do lado do retangulo: ");
        lMenor = input.nextInt();
        System.out.print("Insira a medida do outro lado do retangulo: ");
        lMaior = input.nextInt();
        
        if(lMenor > lMaior) {
            temp = lMenor;
            lMenor = lMaior;
            lMaior = temp;
        }
        
        Retangulo ret = new Retangulo(lMenor, lMaior);
        System.out.println(ret);
        System.out.println("A área desse retangulo é: " + ret.area());
        System.out.println("O perimetro desse retangulo é: " + ret.perimetro());
        
        input.close();
    }
}
