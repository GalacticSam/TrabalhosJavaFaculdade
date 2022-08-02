package ex432;

public class Computador {
    String modelo, cor, os;
    int ram, hdd, clock;

    public Computador() {
    }

    public Computador(String modelo, String cor, String os, int ram, int hdd, int clock) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setOs(os);
        this.setRam(ram);
        this.setHdd(hdd);
        this.setClock(clock);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }
    
    public int getRamGB() {
        return ram / 1000;
    }

    public void setRam(int ram) {
        if(ram < 0) {
            System.out.println("Valor Invalid0!");
        } else {
            this.ram = ram;
        }
    }

    public int getHdd() {
        return hdd;
    }
    
    public int getHddGB() {
        return hdd / 1000;
    }

    public void setHdd(int hdd) {
        if(hdd < 0) {
            System.out.println("Valor Invalid0!");
        } else {
            this.hdd = hdd;
        }
    }

    public int getClock() {
        return clock;
    }
    
    public int getClockGhz() {
        return (clock / 1000);
    }

    public void setClock(int clock) {
        if(clock < 0) {
            System.out.println("Valor Invalid0!");
        } else {
            this.clock = clock;
        }
    }

    public String toString() {
        return "Computador{" + "modelo=" + modelo + ", cor=" + cor + ", os=" + os + ", ram(MB)=" + ram + ", hdd(MB)=" + hdd + ", clock(MHz)=" + clock + '}';
    }
}
