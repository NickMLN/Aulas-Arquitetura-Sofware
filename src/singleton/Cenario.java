package singleton;

public class Cenario {
    private static Cenario cenario;

    private Cenario() {}

    public static Cenario getInstace() {
        return cenario;
    }
}
