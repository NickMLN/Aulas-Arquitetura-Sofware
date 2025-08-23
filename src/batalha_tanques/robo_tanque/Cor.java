package batalha_tanques.robo_tanque;

public interface Cor {
    void atribuirCorTanque(CoresRGB corTanque);
    void atribuirCorCanhao(CoresRGB corCanhao);
    CoresRGB retCorTanque();
    CoresRGB retCorCanhao();
}
