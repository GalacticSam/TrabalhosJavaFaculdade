package ex410;

import java.util.Arrays;
import java.util.Scanner;

public class MenuOptions {  
    
    Scanner input = new Scanner(System.in);
    int contador = 0;
    int[] array = new int[10]; 

    public int[] menuSelect(int menuIn) {
        switch (menuIn) {
            case 1:
                addToArray(array);
                break;
            
            case 2:
                removeFromArray(array);
                break;

            case 3:
                searchInArray(array);
                break;

            default:
                break;
            }
        return array;
    }

    private void searchInArray(int[] array) {
        System.out.println("Insira o inteiro que deseja pesquisar: ");
        int search = input.nextInt();
        System.out.println("Inteiro " + search + " encontrado na posicao " +  Arrays.binarySearch(array, (int)search) + " do vetor");
    }

    private void removeFromArray(int[] array) {
        if (contador > 0) {
            contador--;
            System.out.println("Inteiro " + array[contador] + " apagado.");
            array[contador] = 0;
        } else {
            System.out.println("Nao foi possível excluir um valor do vetor");
        }
    }

    private void addToArray(int[] array) {
        if (contador < 10) {
            System.out.println("Insira o numero inteiro: ");
            array[contador] = input.nextInt();
            contador++;
        } else {
            System.out.println("Nao foi possível inserir o valor no vetor");
        }
    }
}
