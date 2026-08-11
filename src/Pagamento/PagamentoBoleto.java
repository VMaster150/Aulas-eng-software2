package Pagamento;

public class PagamentoBoleto implements Pagamento{
    @Override
    public void ProcessarPagamento(double value) {
        double acrescimo = valor * 0.05;
        double valorFinal = value + acrescimo;
        System.out.println("O pagamento foi processado com sucesso!");
        System.out.println("Valor total: " + valorFinal);
    }

}
