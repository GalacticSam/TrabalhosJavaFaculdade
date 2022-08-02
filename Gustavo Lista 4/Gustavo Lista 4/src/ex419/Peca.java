package ex419;

public class Peca {
    
    private final int codigo;
    private final String descricao;
    private final double preco;

    public Peca(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String toString() {
        return "Peça \tCódigo: " + codigo + "\n\tDescrição: " + descricao + "\n\tPreço: R$" + preco;
    }
}
