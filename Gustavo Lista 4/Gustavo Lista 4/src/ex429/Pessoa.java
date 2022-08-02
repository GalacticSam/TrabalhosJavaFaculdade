package ex429;

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
        
        if(dia < 1 || dia > 31) {
            System.out.println("Dia invalido!");
            this.setDataDeNascimento(1,1,1900);
        }
        
        if(mes < 1 || mes > 12) {
            System.out.println("Mes invalido!");
            this.setDataDeNascimento(1,1,1900);
        }
        
        if(ano < 1800) {
            System.out.println("Ano invalido!");
            this.setDataDeNascimento(1,1,1900);
        }
        
    }

    public String getDataDeNascimento() {
        return dia + "/" + mes + "/" + ano;
    }

    public String toString() {
        return "Pessoa{" + "Nome=" + nome + ", Sobrenome=" + sobrenome + ", Data de Nascimento=" + this.getDataDeNascimento() + '}';
    }
}
