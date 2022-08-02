package ex420;

public class Retangulo {
    
    private final int lMenor;
    private final int lMaior;

    public Retangulo(int lMenor, int lMaior) {
        this.lMenor = lMenor;
        this.lMaior = lMaior;
    }
    
    public int area() { 
        return lMenor * lMaior;
    }
    
    public int perimetro() {
        return (lMenor * 2) + (lMaior * 2);
    }

    public String toString() {
        return "O retangulo possui " + lMenor + " como lado menor e " 
                + lMaior + " como lado maior.";
    }
    
}
