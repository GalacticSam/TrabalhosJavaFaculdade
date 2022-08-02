package ex424;

public class UsaFruta {
    
    public static void main(String[] args) {
        Fruta f1 = new Fruta("Abacaxi", "Amarelo");
        Fruta f2 = new Fruta("Uva", "Verde");
        Fruta f3 = new Fruta("Cereja", "Vermelho");
        
        f1.setPreco(5);
        f2.setPreco(1);
        f3.setPreco(-2);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
