package ex431;

public class Animal {
    
    String nome, especie, cor;
    int patas;

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        if(patas < 0) {
            System.out.println("Valor Invalido!");
        } else {
            this.patas = patas;
        }
    }

    public Animal(String nome, String especie, String cor, int patas) {
        this.setNome(nome);
        this.setEspecie(especie);
        this.setCor(cor);
        this.setPatas(patas);
    }

    public String toString() {
        return "Animal{" + "nome=" + nome + ", especie=" + especie + ", cor=" + cor + ", patas=" + patas + '}';
    }
}
