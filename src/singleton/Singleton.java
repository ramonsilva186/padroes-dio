package singleton;

public class Singleton {
    private static Singleton instanciaUnica;

    private Singleton() {}

    public static synchronized Singleton getInstanciaUnica() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    public void mostrarMensagem() {
        System.out.println("Instância única do Singleton.");
    }
}
