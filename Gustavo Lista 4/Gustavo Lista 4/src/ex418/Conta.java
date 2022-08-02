package ex418;

public class Conta {
    private final int id;
    private double saldo;

    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }
    
    public void deposito(double valor) {
        if(valor < 0) {
            System.err.println("Valor inválido!");
        } else {
            saldo = saldo + valor;
        }
    }
    
    public void sacar(double valor) {
        if(valor > saldo || valor < 0) {
            System.err.println("Valor inválido!");
        } else {
            saldo = saldo - valor;
        }
    }
    
    public void imprimir() {
        System.out.print("A conta ID " + id + " possui R$" + saldo);

    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", saldo=" + saldo + '}';
    }
    
    
}
