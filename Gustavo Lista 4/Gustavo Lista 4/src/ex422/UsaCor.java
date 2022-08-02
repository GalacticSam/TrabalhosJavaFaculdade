package ex422;

import java.util.Scanner;

public class UsaCor {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        int r, g, b, choice;
        System.out.print("Insira o valor vermelho da cor: ");
        r = input.nextInt();
        System.out.print("Insira o valor verde da cor: ");
        g = input.nextInt();
        System.out.print("Insira o valor azul da cor: ");
        b = input.nextInt();
        
        Cor cor = new Cor(r,g,b);
        
        
        do {
            
            System.out.println("\t---------------");
            System.out.println("1) Clarear a cor");
            System.out.println("2) Escurecer a cor");
            System.out.println("3) Verificar cor");
            System.out.println("4) Sair");
            System.out.print("\nEscolha uma opção: ");
            choice = input.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("\t---------------");
                    System.out.println("Clareando a cor...");
                    System.out.println("A cor agora é: " + cor.clarear());
                    break;
                case 2:
                    System.out.println("\t---------------");
                    System.out.println("Escurecendo a cor...");
                    System.out.println("A cor agora é: " + cor.escurecer());
                    break;
                case 3:
                    System.out.println("\t---------------");
                    System.out.println("A cor é: " + cor);
                    break;
                case 4:
                    System.out.println("Shutting down...");
                    break;
                default:
                    System.err.println("Opção invalida!");
                    break;
            }
        } while(choice != 4);

        input.close();
    }
}
