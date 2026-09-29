package Pagamento;

public class PagamentoPix implements Pagamento{
    @Override
    public void ProcessarPagamento(double value) {

    }

    @Override
    public void processarPagamento (double value) {
        System.out.println("O pagamento foi processado com sucesso!");
        System.out.println("Valor total: " + value);
    }
}
