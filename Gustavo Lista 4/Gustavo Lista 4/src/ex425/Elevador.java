package ex425;

public class Elevador {
    
    private int passageiros;
    private int max;
    private int at = 0;

    public Elevador() {
    }

    public Elevador(int passageiros, int max) {
        if(passageiros < 0) {
            this.passageiros = 0;
        } else {
            this.passageiros = passageiros;
        }
        if(max < 0) {
            this.max = 1;
        } else {
            this.max = max;
        }
    }
    
    public void subir(int n) {
        
        int destino = n + this.at; 
        System.out.println("A origem é o andar " + this.at + " e o destino é o andar " + destino + ".");
        
        for (int i = this.at; i < destino; i++) {
            this.at++;
            System.out.println("O elevador subiu para o andar " + this.at);
        }
        
        System.out.println("O elevador chegou ao seu destino no andar " + this.at + ".");
        
    }
    
    public void descer(int n) {
        
        
        int dest = this.at - n; 
        System.out.println("A origem é o andar " + this.at + " e o destino é o andar " + dest + ".");
        
        for (int i = this.at; i > dest; i--) {
            this.at--;
            System.out.println("O elevador desceu até o andar " + this.at);
        }
        
        System.out.println("O elevador chegou ao seu destino no andar " + this.at + ".");
        
    }

    public String toString() {
        return  "Elevador{" + "Quatidade de Passageiros=" + passageiros + ", Andar Maximo=" + max + ", Andar Atual=" + at + '}';
    }
    
    
}
