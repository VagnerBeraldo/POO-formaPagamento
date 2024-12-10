package app;

import java.util.Scanner;
import tiposPagamento.PagamentoBoleto;
import tiposPagamento.PagamentoCartaoCredito;
import tiposPagamento.PagamentoPix;

public class POO_LojaOnlinePagamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Loja SENAC");
        System.out.print("Digite o valor R$ ");
        double valor = sc.nextDouble();
        
        System.out.println("Forma de Pagamento");
        System.out.print("1) Cartão de Crédito\t2) PIX\t3) Boleto\nOpção: ");
        int op = sc.nextInt();
        
        switch (op){
            case 1:
                PagamentoCartaoCredito pagamentoCartao = new PagamentoCartaoCredito(valor);

                double valorCartao = pagamentoCartao.processarPagamento();

                if (pagamentoCartao.getStatusPagamento()) {
                    System.out.printf("Valor total: R$ %.2f\n", valorCartao);
                    System.out.print("Quantidade de parcelas: ");
                    int parcela = sc.nextInt();
                    System.out.printf("%d parcelas no valor de R$ %.2f cada\n", parcela, (valorCartao / parcela));
                } else {
                    System.out.println("Pagamento não aprovado.");
                }
                break;
                
            case 2:
                PagamentoPix pgtoPix = new PagamentoPix(valor);
                
                double valorPix = pgtoPix.processarPagamento();
                
                if (pgtoPix.getStatusPagamento()) {
                    System.out.printf("Valor total a pagar R$ %.2f\n", valorPix);
                } else {
                    System.out.println("Pagamento não aprovado.");
                }
                break;
            case 3:
                PagamentoBoleto pgtoBoleto = new PagamentoBoleto(valor);
                
                double valorBoleto = pgtoBoleto.processarPagamento();
                
                if (pgtoBoleto.getStatusPagamento()) {
                    System.out.printf("Valor total: R$ %.2f\n", valorBoleto);
                } else {
                    System.out.println("Pagamento não aprovado.");
                }
                break;
            default:
                System.out.println("Opção " + op + " inválida");
        } 
        sc.close();
    }
    
}
