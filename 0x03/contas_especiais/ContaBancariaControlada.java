import exceptions.OperacaoInvalidaException;

public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo,
            double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        // sobrescreva o método aplicarAtualizacaoMensal para além de reajustar o saldo
        // da conta subtraindo a tarifa mensal e adicionando o valor de juros mensal
        // também aplicar a penalidade caso o saldo esteja abaixo do saldo mínimo.
        super.aplicarAtualizacaoMensal();
        if (this.getSaldo() < saldoMinimo) {
            this.saldo -= this.valorPenalidade;
        }

    }

}
