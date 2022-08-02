package ex428;

public class Pessoa {
    
    private String nome, sobrenome;
    private int dia, mes, ano;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDataDeNascimento(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getDataDeNascimento() {
        return dia + "/" + mes + "/" + ano;
    }

    public String toString() {
        return "Pessoa{" + "Nome=" + nome + ", Sobrenome=" + sobrenome + ", Data de Nascimento=" + this.getDataDeNascimento() + '}';
    }
}
