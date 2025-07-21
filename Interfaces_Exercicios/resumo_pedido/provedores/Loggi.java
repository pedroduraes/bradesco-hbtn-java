package provedores;

public class Loggi implements ProvedorFrete {

    @Override
    public Frete calcularFrete(double peso, double valor) {
        /*
         * Classe Loggi: o valor do frete é 12% do valor total do pedido, se peso passar
         * de 5kg, senão o valor é 4% do valor do pedido.
         * 
         * 
         */
        Frete frete = new Frete();
        frete.setTipoProvedorFrete(TipoProvedorFrete.LOGGI);
        if (peso > 5000) {
            valor = (valor * 0.12);
        } else {
            valor = (valor * 0.04);
        }
        frete.setValor(valor);

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }

}
