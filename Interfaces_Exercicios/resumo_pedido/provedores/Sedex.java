package provedores;

public class Sedex implements ProvedorFrete {

    public Sedex(){}

    @Override
    public Frete calcularFrete(double peso, double valor) {
        /*
         * Classe Sedex: o valor do frete é 10% do valor total do pedido, se peso passar
         * de 1kg, senão o valor é 5% do valor do pedido.
         * 
         */
        Frete frete = new Frete();
        frete.setTipoProvedorFrete(TipoProvedorFrete.SEDEX);
        if (peso > 1000) {
            valor =(valor * 0.10);
        } else {
            valor =  (valor * 0.05);
        }
        frete.setValor(valor);

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }

}
