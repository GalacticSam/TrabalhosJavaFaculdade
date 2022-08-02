package ex426;

public class UsaElevador {
    public static void main(String[] args) {
        Elevador e1 = new Elevador(20, 10);
        Elevador e2 = new Elevador(4, 5);
        Elevador e3 = new Elevador(220, -1);
        
        e1.descer(20);
        e1.subir(4);
        e1.subir(11);
        e1.descer(2);
        e1.subir(1);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
