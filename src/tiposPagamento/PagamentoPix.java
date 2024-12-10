package tiposPagamento;

import pagamento.Pagamento;
import validacaoPagamento.ValidacaoPagamento;

public class PagamentoPix extends Pagamento implements ValidacaoPagamento {
    private double desconto = 0.1;
    
    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public double processarPagamento() {
        if (validarTransacao()) {
            setStatusPagamento(true); 
            System.out.print("PIX processado com sucesso. ");
            System.out.printf("\nDesconto de R$ %.2f\n", getValorPagamento() * desconto);
            double valorComDesconto = getValorPagamento() - (getValorPagamento() * desconto); 
            return valorComDesconto;
        } else {
            setStatusPagamento(false);
            System.out.println("Falha ao processar pagamento via PIX.");
            return 0; 
        }
    }

    @Override
    public boolean validarTransacao() {
        return Math.random() > 0.1;
    }
    
}
