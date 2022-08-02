package ex411;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        int n;
        String encrypt;
        Scanner input = new Scanner(System.in);

        do {
            n = input.nextInt();

            if (n < 1 || n > 10000){
                System.out.println("Numero invalido, tente novamente");
            }
        } while (n < 1 || n > 10000);
        
        input.nextLine();
        for (int i = 0; i < n; i++) {
            encrypt = input.nextLine();
            System.out.println(encryption(encrypt));
        }

        input.close();
    }

    public static String encryption(String frase){
        char[] aTemp = frase.toCharArray();

        for (int i = 0; i < frase.length(); i++){
            if(Character.isAlphabetic(aTemp[i])){
                aTemp[i] = (char) (((int) aTemp[i]) + 3);
            }
        }
        
        frase = new String(aTemp);
        StringBuilder fraseTemp = new StringBuilder(frase);
        fraseTemp.reverse();
        aTemp = fraseTemp.toString().toCharArray();
        
    
        for (int i = (int) Math.ceil(frase.length()/2); i < frase.length(); i++){
            aTemp[i] = (char) (((int) aTemp[i]) - 1);
        }
        
        frase = new String(aTemp);
    
        return frase;
    }
}