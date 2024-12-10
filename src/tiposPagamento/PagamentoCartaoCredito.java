package tiposPagamento;

import pagamento.Pagamento;
import validacaoPagamento.ValidacaoPagamento;

public class PagamentoCartaoCredito extends Pagamento implements ValidacaoPagamento {
    private double taxa = 0.1;
    
    public PagamentoCartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public double processarPagamento() {
        if (validarTransacao()) {
            setStatusPagamento(true); 
            System.out.print("Transação com cartão de crédito aprovada. ");
            System.out.printf("\nTaxa de cartão R$ %.2f\n", getValorPagamento() * taxa);
            double valorComTaxa = getValorPagamento() + (getValorPagamento() * taxa);
            return valorComTaxa;
        } else {
            setStatusPagamento(false);
            System.out.println("Falha ao processar pagamento com cartão de crédito.");
            return 0; 
        }
    }

    @Override
    public boolean validarTransacao() {
        return Math.random() > 0.3;
    }
    
}
