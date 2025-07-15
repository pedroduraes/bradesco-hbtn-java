public class Empregado {
    private double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    public double getSalarioFixo() {
        return this.salarioFixo;
    }

    // retorna o valor bonus do empregado conforme dados do empregado e do departamento.
    //recebem 10% do salario fixo caso o departamento tenha atingido sua meta.
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            return this.salarioFixo * 0.1;
        }
        return 0;
    }

    // retorna o valor do salario fixo do empregado acrescentado de seu bonus.
    public double calcularSalarioTotal(Departamento departamento) {
        double bonus = this.calcularBonus(departamento);
        return salarioFixo + bonus;
    }
}
