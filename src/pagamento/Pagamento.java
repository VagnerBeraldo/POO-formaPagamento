package pagamento;
public abstract class Pagamento {
    private double valorPagamento;
    private boolean statusPagamento;
    
    public Pagamento(double valor) {
        this.valorPagamento = valor;
        this.statusPagamento = false; 
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public boolean getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
    
    
    
    public abstract double processarPagamento();
    
}
