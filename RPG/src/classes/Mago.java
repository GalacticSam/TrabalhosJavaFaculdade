package classes;

import inimigos.Boss;

public class Mago extends Guerreiro {
    public Mago(){
        this.setHp(50);
        this.setDmg(20);
        this.setMp(150);
        this.setCritChance(0.05);
        this.setAttackType("seu feitiço.");
    }

    @Override
    public void attack(Boss boss) {
        super.attack(boss);
        this.setMp(this.getMp() - 15);
    }
}
