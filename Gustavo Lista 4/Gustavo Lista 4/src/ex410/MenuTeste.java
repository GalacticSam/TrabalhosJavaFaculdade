package ex410;

import java.util.Arrays;
import java.util.Scanner;

public class MenuTeste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int menuIn;
        MenuOptions menu = new MenuOptions();

        do {
            System.out.println("1) Cadastrar um inteiro positivo");
            System.out.println("2) Apagar um inteiro");
            System.out.println("3) Pesquisar um inteiro");
            System.out.println("4) Sair");
            
            menuIn = input.nextInt();
            
            System.out.println(Arrays.toString(menu.menuSelect(menuIn)));
        } while (menuIn != 4);

        input.close();
    }
}
