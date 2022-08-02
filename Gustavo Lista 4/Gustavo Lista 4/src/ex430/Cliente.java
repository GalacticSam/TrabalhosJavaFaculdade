package ex430;

public class Cliente {
    
    private String nome, sobrenome, rua, bairro, cidade, estado;
    private int cpf, numero;

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String rua, String bairro, String cidade, String estado, int cpf, int numero) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setRua(rua);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setCpf(cpf);
        this.setNumero(numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero < 0) {
            System.out.println("Valor Invalid0!");
        } else {
            this.numero = numero;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cpf=" + cpf + ", numero=" + numero + '}';
    }
    
    
}
