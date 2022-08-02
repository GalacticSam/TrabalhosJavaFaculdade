package inimigos;

import classes.Guerreiro;

public class Boss {
    private int hp;
    private int dmg;
    private boolean vivo = true;

    public Boss(){
        this.hp = 400;
        this.dmg = 15;
    }
    
    public int getHp() {
        return hp;
    }



    public void setHp(int hp) {
        this.hp = hp;
    }



    public int getDmg() {
        return dmg;
    }



    public void setDmg(int dmg) {
        this.dmg = dmg;
    }



    public void attack(Guerreiro[] guerreiros){
        int tempDmg = (int) Math.ceil(this.dmg * (Math.random() + 1));
        for (int i = 0; i < guerreiros.length; i++) {
            guerreiros[i].setHp(guerreiros[i].getHp() - tempDmg);
        }
        System.out.println("O boss causou " + tempDmg + " de dano aos guerreiros.");
    }

    public void checkDeath() {
        if (this.hp <= 0) {
            System.out.println("O " + this.getClass().getSimpleName() + " morreu");
            setVivo(false);
        }
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    
}
