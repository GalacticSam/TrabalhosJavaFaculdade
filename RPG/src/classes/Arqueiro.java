package classes;

import inimigos.Boss;

public class Arqueiro extends Guerreiro {
    private int ammo;

    public Arqueiro(){
        this.setHp(80);
        this.setDmg(15);
        this.setMp(150);
        this.setCritChance(0.2);
        this.setAmmo(50);
        this.setAttackType("sua flecha.");
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    @Override
    public void attack(Boss boss) {
        super.attack(boss);
        this.setAmmo(ammo - 1);
    }
}
