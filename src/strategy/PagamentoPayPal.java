package strategy;

public class PagamentoPayPal implements MetodoPagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento " + valor + " com PayPal");
    }
}
