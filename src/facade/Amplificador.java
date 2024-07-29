package facade;

public class Amplificador {
    public void ligar() {
        System.out.println("Amplificador ligado.");
    }

    public void definirEntrada(String tipo) {
        System.out.println("Entrada definida para " + tipo);
    }

    public void ajustarVolume(int volume) {
        System.out.println("Volume ajustado para " + volume);
    }
}
