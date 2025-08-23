package batalha_tanques.robo_tanque;

public interface Posicao {
    void movLeste();
    void movOeste();
    void movSul();
    void movNorte();
    int retPosicaoX();
    int retPosicaoY();
}
