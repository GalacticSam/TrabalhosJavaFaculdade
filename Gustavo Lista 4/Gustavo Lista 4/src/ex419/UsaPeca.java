package ex419;

import java.util.Scanner;

public class UsaPeca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        int codigo;
        String descricao;
        double preco;
        
        System.out.print("Insira o codigo do item: ");
        codigo = input.nextInt();
        System.out.print("Insira a descrição do item: ");
        descricao = input.next();
        System.out.print("Insira o preço do item: ");
        preco = input.nextDouble();
        
        Peca peca = new Peca(codigo, descricao, preco);
        
        System.out.println(peca);

        input.close();
    }
}
