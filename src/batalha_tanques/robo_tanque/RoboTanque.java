package batalha_tanques.robo_tanque;

public class RoboTanque implements Cor, Canhao, Posicao {
    private int x, y;
    private CoresRGB corTanque, corCanhao;

    public RoboTanque() {
    }

    public RoboTanque(int x, int y, CoresRGB corTanque, CoresRGB corCanhao) {
        this.x = x;
        this.y = y;
        this.corTanque = corTanque;
        this.corCanhao = corCanhao;
    }

    private void esperar(long cadencia) {
        try {
            if (cadencia > 5000) {
                throw new IllegalArgumentException("Valor Inválido");
            }
            Thread.sleep(cadencia);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "RoboTanque{" +
                "x=" + x +
                ", y=" + y +
                ", corTanque=" + corTanque +
                ", corCanhao=" + corCanhao +
                '}';
    }

    @Override
    public void atirar() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Atirando...");
        }
    }

    @Override
    public void atirar(long cadencia) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Atirando...");
            esperar(cadencia * 1000);
        }
    }

    @Override
    public void atribuirCorTanque(CoresRGB corTanque) {
        this.corTanque = corTanque;
    }

    @Override
    public void atribuirCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;
    }

    @Override
    public CoresRGB retCorTanque() {
        return this.corTanque;
    }

    @Override
    public CoresRGB retCorCanhao() {
        return this.corCanhao;
    }

    @Override
    public void movLeste() {
        this.x++;
    }

    @Override
    public void movOeste() {
        this.x--;
    }

    @Override
    public void movSul() {
        this.y--;
    }

    @Override
    public void movNorte() {
        this.y++;
    }

    @Override
    public int retPosicaoX() {
        return this.x;
    }

    @Override
    public int retPosicaoY() {
        return this.y;
    }
}
