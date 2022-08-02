package ex421;

public class Ponto {
    
    private final double x;
    private final double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Ponto outro) {
        return Math.sqrt(Math.pow(Math.abs(this.x - outro.x), 2) + Math.pow(Math.abs(this.y - outro.y), 2));
    }
    
    public String toString() {
        return "{" + x + ", " + y + "}";
    }
    
    
}
