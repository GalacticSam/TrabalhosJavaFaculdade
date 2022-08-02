package exercicios;

public class Exercicio234 {
    public static void main(String[] args){
        long populacao = 7929905904L;
        long previsao = populacao;

        System.out.println("Populacao atual: " + populacao);
        for(int i = 0; i < 5; i++){
            previsao *= 1.011;
            System.out.println("Populacao em " + (i+1) + " ano(s): " + previsao);
        }

    }
}
