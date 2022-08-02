package ex417;

import java.util.Scanner;

public class UsaData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        int dia, mes, ano;
        
        System.out.print("Insira o dia: ");
        dia = input.nextInt();
        System.out.print("Insira o mes: ");
        mes = input.nextInt();
        System.out.print("Insira o ano: ");
        ano = input.nextInt();
        
        Data data = new Data(dia, mes, ano);
        
        System.out.println("A data inserida foi: " + data);

        input.close();
    }
}
