package ex429;

public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        p1.setNome("Jeferson");
        p2.setNome("Eneas");
        p3.setNome("Maria");
        
        p1.setSobrenome("da Silva");
        p2.setSobrenome("Oliveira");
        p3.setSobrenome("Carvalho");
        
        p1.setDataDeNascimento(2, 4, 1700);
        System.out.println(p1);
        p2.setDataDeNascimento(-2, 43, 2000);
        System.out.println(p2);
        p3.setDataDeNascimento(5, 6, 2000);
        System.out.println(p3);
        
    }
}
