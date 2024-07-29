import strategy.*;
import facade.*;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        // Testando o padrão Strategy
        System.out.println("=== Testando o padrão Strategy ===");
        PagamentoContexto contexto = new PagamentoContexto();

        contexto.setMetodoPagamento(new PagamentoCartaoCredito());
        contexto.realizarPagamento(100.0);

        contexto.setMetodoPagamento(new PagamentoPayPal());
        contexto.realizarPagamento(200.0);

        // Testando o padrão Facade
        System.out.println("\n=== Testando o padrão Facade ===");
        Amplificador amplificador = new Amplificador();
        ReprodutorDVD reprodutorDVD = new ReprodutorDVD();
        TelaProjeto telaProjeto = new TelaProjeto();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplificador, reprodutorDVD, telaProjeto);
        homeTheater.assistirFilme("O Senhor dos Anéis");

        // Testando o padrão Singleton
        System.out.println("\n=== Testando o padrão Singleton ===");
        Singleton singleton1 = Singleton.getInstanciaUnica();
        Singleton singleton2 = Singleton.getInstanciaUnica();

        singleton1.mostrarMensagem();


        System.out.println((singleton1 == singleton2));
    }
}
