
public class FolhaPagamento {

    /*
     * Possui o método estático calcularLiquido que recebe como parâmetro um objeto
     * Funcionario e um CalculadorDeSalario, esse método chama o método calcular do
     * CalculadorDeSalario recebido como parâmetro. Dessa forma, fica a cargo de
     * quem chama esse método especificar como o salário líquido deve ser calculado.
     * 
     */
    public static double calcularLiquido(Funcionario func, CalculadorDeSalario calc) {
        return calc.calcular(func.getSalario());
    }

}
