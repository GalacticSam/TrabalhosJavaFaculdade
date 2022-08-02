package ex428;

public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        p1.setNome("Chitaozinho");
        p2.setNome("Fabiano");
        p3.setNome("Cesar");
        
        p1.setSobrenome("e Xororo");
        p2.setSobrenome("da Silva");
        p3.setSobrenome("Menotti");
        
        p1.setDataDeNascimento(2, 4, 2000);
        p2.setDataDeNascimento(1, 5, 2000);
        p3.setDataDeNascimento(5, 6, 2000);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
    }
}
