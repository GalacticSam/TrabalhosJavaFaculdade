package exercicios;

public class Exercicio229 {
    public static void main(String[] args){
        char[] array = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};
        
        for(int i = 0; i < 14; i++){
            System.out.println("The character " + array[i] + " has the value " + ((int) array[i]));
        }
        
    }
}
