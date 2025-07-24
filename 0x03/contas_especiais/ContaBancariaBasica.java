import exceptions.*;

public class ContaBancariaBasica {

    private String numeracao;
    protected double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.saldo = 0;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }


    public void sacar(double valor) throws OperacaoInvalidaException{
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if (valor > this.saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        this.saldo -= valor;
    }   

    public double calcularTarifaMensal() {
        //método que calcula a tarifa cobrada mensalmente pelo banco.
        //banco cobra R$ 10,00 ou 10% do saldo atual da conta, é utilizado aquele que der o valor menor.
        double valor = this.saldo * 0.10;
        if(valor < 10) return valor;
        return 10;
    }

    public double calcularJurosMensal() {
        //método que calcula o valor em R$ do juros mensal a ser aplicado ao saldo da conta.
        //taxa de juros é 0 quando a conta possui saldo negativo
        if (this.saldo < 0) return 0;
        double taxaMensal = taxaJurosAnual / 12;
        return this.saldo * (taxaMensal/100);
    }

    public void aplicarAtualizacaoMensal() {
        //reajusta o saldo da conta subtraindo a tarifa mensal e adicionando o valor de juros mensal.
        double tarifaMensal = this.calcularTarifaMensal();
        double jurosMensal = this.calcularJurosMensal();
        this.saldo -= tarifaMensal;
        this.saldo += jurosMensal;
    }
    
    


}
