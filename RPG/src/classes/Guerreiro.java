package classes;

import inimigos.Boss;

public class Guerreiro {
    private int lvl;
    private int dmg;
    private int hp;
    private int mp;
    private boolean vivo = true;
    private double critChance;
    private String attackType;

    public Guerreiro(){
        this.setHp(100);
        this.setDmg(10);
        this.setMp(100);
        this.setCritChance(0.1);
        this.setAttackType("sua arma.");
    }

    public void attack(Boss boss) {
        if (vivo) {
            int tempDmg = (int) Math.ceil(this.getDmg() * (Math.random() + 1));
            if (Math.random() < this.getCritChance()) {
                tempDmg *= 3;
            }
    
            boss.setHp(boss.getHp() - tempDmg);
    
            System.out.println("O " + this.getClass().getSimpleName() + " causou " + tempDmg + " de dano com " + getAttackType());
        }
    }

    public void checkDeath() {
        if (this.getHp() <= 0) {
            System.out.println("O " + this.getClass().getSimpleName() + " morreu.");
            vivo = false;
        }
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public double getCritChance() {
        return critChance;
    }

    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    
}
