package strategy;

public class PagamentoCartaoCredito implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento " + valor + " com cartão de crédito");
    }
}
