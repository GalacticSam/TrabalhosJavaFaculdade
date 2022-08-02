package ex423;

public class UsaFruta {
    
    public static void main(String[] args) {
        Fruta f1 = new Fruta("Laranja", "Laranja");
        Fruta f2 = new Fruta("Uva", "Roxo");
        Fruta f3 = new Fruta("Maca", "Vermelho");
        
        f1.setPreco(5);
        f2.setPreco(1);
        f3.setPreco(2);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
