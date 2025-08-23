package projeto_carro_eletrico.carro_eletrico;

public interface VeiculoEletricoAutonomo extends Bateria, VeiculoAutonomo{
    void definirRota(String partida, String destino);
    void monitorarBateria();
}
