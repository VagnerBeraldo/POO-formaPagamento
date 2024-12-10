package tiposPagamento;

import pagamento.Pagamento;
import validacaoPagamento.ValidacaoPagamento;

public class PagamentoBoleto extends Pagamento implements ValidacaoPagamento {
    
    private double taxaBoleto = 0.3;
    
    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public double processarPagamento() {
        if (validarTransacao()) {
            setStatusPagamento(true); 
            System.out.print("Transação com boleto aprovada. ");
            System.out.printf("\nTaxa de emissão de boleto R$ %.2f\n", getValorPagamento() * taxaBoleto);
            double valorComTaxa = getValorPagamento() + (getValorPagamento() * taxaBoleto);
            return valorComTaxa;
        } else {
            setStatusPagamento(false);
            System.out.println("Falha ao processar pagamento com boleto bancário.");
            return 0; 
        }
    }

    @Override
    public boolean validarTransacao() {
        return Math.random() > 0.2;
    }
    
}
