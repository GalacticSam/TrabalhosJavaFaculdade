package modelo;

public class Aluno {
    private String nome;
    private String RA;
    private Sexo sexo;
    
    public Aluno(String nome, String rA, boolean sexo) {
        this.nome = nome;
        RA = rA;
        if (sexo) {
            this.sexo = Sexo.MASCULINO;
        }else{
            this.sexo = Sexo.FEMININO;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String rA) {
        RA = rA;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        if (sexo) {
            this.sexo = Sexo.MASCULINO;
        }else{
            this.sexo = Sexo.FEMININO;
        }
    }

    @Override
    public String toString() {
        return "nome=" + nome + "\nRA=" + RA + "\nsexo=" + sexo;
    }
    
    
}
