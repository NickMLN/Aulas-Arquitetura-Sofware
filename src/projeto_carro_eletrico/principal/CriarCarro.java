package projeto_carro_eletrico.principal;

import projeto_carro_eletrico.carro_eletrico.Tesla;

public class CriarCarro {
    public static void main(String[] args) {
        Tesla cyberTruck = new Tesla(100);
        cyberTruck.definirRota("Zona Sul", "Senac");
        cyberTruck.monitorarBateria();
        cyberTruck.ligarModoAutonomo();
        System.out.println(cyberTruck.toString());
    }
}
