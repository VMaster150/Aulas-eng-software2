package Pagamento;

public class Main {
    public static void main(String[] args) {

        Pagamento pagamento = new PagamentoCartao();
        pagamento.processarPagamento(10.0);
    }
}