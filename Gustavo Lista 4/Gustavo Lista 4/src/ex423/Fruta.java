package ex423;

public class Fruta {
    
    private String descricao;
    private String cor;
    double preco;

    public Fruta() {
        
    }

    public Fruta(String descricao, String cor) {
        this.descricao = descricao;
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public String toString() {
        return "Fruta{" + "descricao=" + descricao + ", cor=" + cor + ", preco=" + preco + '}';
    }
}
