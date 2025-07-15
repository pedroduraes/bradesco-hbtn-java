public class Gerente extends Empregado  {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    // retorna o valor bonus do empregado conforme dados do empregado e do departamento.
    //recebem 20% do salario fixo caso o departamento tenha atingido sua meta, 
    //mais 1% da diferenca entre o resultado alcancado pelo departamento e qual era a meta do departamento. 
    @Override 
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            double bonificacaoExtra = (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01;
            double bonificacao = this.getSalarioFixo() * 0.2;
            return bonificacao + bonificacaoExtra;
        }
        return 0;

    }
}
