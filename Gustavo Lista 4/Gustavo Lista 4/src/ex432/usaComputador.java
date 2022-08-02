package ex432;

public class usaComputador {
    public static void main(String[] args) {
        Computador comp = new Computador("Acer Aspire VX15", "preto", "Windows", 8000, 1000000, 3500);
        System.out.println(comp.getRamGB() + "GB");
        System.out.println(comp.getHddGB() + "GB");
        System.out.println(comp.getClockGhz() + "Ghz");
        System.out.println(comp);
    }   
}