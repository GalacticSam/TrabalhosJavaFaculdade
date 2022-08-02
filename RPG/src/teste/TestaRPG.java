package teste;

import classes.Anao;
import classes.Arqueiro;
import classes.Guerreiro;
import classes.Mago;
import inimigos.Boss;

public class TestaRPG {
    public static void main(String[] args) {
        Guerreiro[] guerreiros = new Guerreiro[3];
        guerreiros[0] = new Arqueiro();
        guerreiros[1] = new Anao();
        guerreiros[2] = new Mago();

        Boss boss = new Boss();
        boolean vivosTemp;

        do {
            vivosTemp = false;
            for (Guerreiro guerreiro : guerreiros) {
                guerreiro.attack(boss);
            }
            
            boss.checkDeath();

            if (boss.isVivo()) {
                System.out.println("Boss: " + boss.getHp());
                boss.attack(guerreiros);
            }

            for (int i = 0; i < guerreiros.length; i++) {
                guerreiros[i].checkDeath();

                if (guerreiros[i].isVivo()) {
                    vivosTemp = true;
                    System.out.println(guerreiros[i].getClass().getSimpleName() + ": " + guerreiros[i].getHp());
                }
            }

        } while (boss.isVivo() && vivosTemp == true);
    }
}
