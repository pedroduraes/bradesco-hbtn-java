public class Departamento {

       
    private double valorMeta;
    private double valorAtingidoMeta;

    public Departamento(double valorMeta, double valorAtingidoMeta)  {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    //Criar metodo alcancouMeta() que retorna um valor boolean que retorna se meta foi atingida ou nao.
    public boolean alcancouMeta() {
        return this.valorAtingidoMeta > valorMeta;
    }

    public double getValorMeta() {
      return valorMeta;  
    } 
    
    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;  
    } 

}
