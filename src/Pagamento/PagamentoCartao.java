package Pagamento;

public class PagamentoCartao implements Pagamento{
    @Override
    public void ProcessarPagamento(double value) {

    }

    @Override
    public void processarPagamento (double value) {
        double acrescimo = value * 0.15;
        double valorFinal = value + acrescimo;
        System.out.println("O pagamento foi processado com sucesso!");
        System.out.println("Valor total: " + valorFinal);
    }
}
