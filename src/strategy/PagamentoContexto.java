package strategy;

public class PagamentoContexto {

    private MetodoPagamento metodoPagamento;

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void realizarPagamento(double valor) {
        metodoPagamento.pagar(valor);
    }
}
