package Pagamento;

public class PagamentoBoleto implements Pagamento{
    @Override
    public void ProcessarPagamento(double value) {
        double acrescimo = value * 0.05;
        double valorFinal = value + acrescimo;
        System.out.println("O pagamento foi processado com sucesso!");
        System.out.println("Valor total: " + valorFinal);
    }

    @Override
    public void processarPagamento(double value) {

    }
}
