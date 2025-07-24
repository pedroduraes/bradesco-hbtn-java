import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    /*
     * sobrescreva os métodos sacar e depositar para aplicar uma tarifa de R$ 0.10
     * por transação. Dica: invoque os métodos da super classe, depois desconte a
     * tarifa.
     */

     @Override
     public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        this.saldo -= 0.10;
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException{
        super.sacar(valor);
        this.saldo -= 0.10;
    }  

}
