package ex427;

import java.util.Scanner;

public class UsaElevador {
    public static void main(String[] args) {
        Elevador e1 = new Elevador(0, 9);
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        int dest;
        int passageiros = 0;
        int passE, passS;
        do {
            System.out.print("Quantos passageiros entraram no elevador? ");
            passE = input.nextInt();
            passageiros = passE + passageiros;
            System.out.print("Quantos passageiros sairam do elevador? ");
            passS = input.nextInt();
            passageiros = passageiros - passS;
            
            System.out.println("7 8 9");
            System.out.println("4 5 6");
            System.out.println("1 2 3");
            System.out.println("  0  ");
            System.out.print("\n Informe o andar desejado: ");
            dest = input.nextInt();
            
            if(e1.getAt() > dest) {
                e1.descer(e1.getAt() - dest);
            } else if (e1.getAt() < dest){
                e1.subir(dest - e1.getAt());
            } else if (e1.getAt() == dest) {
                System.err.println("Você já está neste andar!");
            } 
            
            if(dest < 0) {
                System.out.println("Obrigado por utilizar este elevador.");
                System.out.println(e1);
            }
        }while(dest > 0);
        
        input.close();
    }
}
