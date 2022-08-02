package ex418;

import java.util.Scanner;

public class usaConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        int choice;
        double valor;
        System.out.print("Insira o ID da conta: ");
        Conta conta = new Conta(input.nextInt(), 0);
        
        do {
            
            System.out.println("\n\t---------------");
            System.out.println("1) Fazer um depósito");
            System.out.println("2) Fazer um saque");
            System.out.println("3) Verificar saldo");
            System.out.println("4) Sair");
            System.out.print("\nEscolha uma opção: ");
            choice = input.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("\t---------------");
                    System.out.println("Fazendo depósito...");
                    System.out.print("Insira o valor: ");
                    valor = input.nextDouble();
                    conta.deposito(valor);
                    conta.imprimir();
                    break;
                case 2:
                    System.out.println("\t---------------");
                    System.out.println("Fazendo saque...");
                    System.out.print("Insira o valor: ");
                    valor = input.nextDouble();
                    conta.sacar(valor);
                    conta.imprimir();
                    break;
                case 3:
                    System.out.println("\t---------------");
                    System.out.println("Consultando saldo...");
                    conta.imprimir();
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
