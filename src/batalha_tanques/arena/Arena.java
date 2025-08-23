package batalha_tanques.arena;

import batalha_tanques.robo_tanque.CoresRGB;
import batalha_tanques.robo_tanque.RoboTanque;

public class Arena {
    public static void main(String[] args) {
        RoboTanque roboTanque = new RoboTanque(0, 0, CoresRGB.RED, CoresRGB.RED);
        roboTanque.movLeste();
        roboTanque.movLeste();
        roboTanque.movSul();
        System.out.println(roboTanque.toString());
        roboTanque.atirar();
        try {
            roboTanque.atirar(6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
