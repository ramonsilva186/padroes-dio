package facade;

public class HomeTheaterFacade {
    private Amplificador amplificador;
    private ReprodutorDVD reprodutorDVD;
    private TelaProjeto telaProjeto;

    public HomeTheaterFacade(Amplificador amplificador, ReprodutorDVD reprodutorDVD, TelaProjeto telaProjeto) {
        this.amplificador = amplificador;
        this.reprodutorDVD = reprodutorDVD;
        this.telaProjeto = telaProjeto;
    }

    public void assistirFilme(String filme) {
        System.out.println("Preparando para assistir o filme...");
        telaProjeto.ligar();
        telaProjeto.configurar();
        amplificador.ligar();
        amplificador.definirEntrada("DVD");
        amplificador.ajustarVolume(10);
        reprodutorDVD.ligar();
        reprodutorDVD.reproduzir(filme);
    }
}
