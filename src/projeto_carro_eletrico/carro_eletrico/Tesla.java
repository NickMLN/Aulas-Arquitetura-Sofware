package projeto_carro_eletrico.carro_eletrico;

public class Tesla implements VeiculoEletricoAutonomo {
    private String partida, destino;
    private int carga;
    private boolean modoAutonomo;

    public Tesla() {
    }

    public Tesla(int carga) {
        this.carga = carga;
    }

    @Override
    public void definirRota(String partida, String destino) {
        this.partida = partida;
        this.destino = destino;
    }

    @Override
    public void monitorarBateria() {
        System.out.println("Carga: " + carga);
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando...");
    }

    @Override
    public void ligarModoAutonomo() {
        modoAutonomo = true;
    }

    @Override
    public void desligarModoAutonomo() {
        modoAutonomo = false;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "partida='" + partida + '\'' +
                ", destino='" + destino + '\'' +
                ", carga=" + carga +
                ", modoAutonomo=" + modoAutonomo +
                '}';
    }
}
