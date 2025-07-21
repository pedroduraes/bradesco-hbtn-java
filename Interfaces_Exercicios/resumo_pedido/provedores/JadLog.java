package provedores;

public class JadLog implements ProvedorFrete {

    @Override
    public Frete calcularFrete(double peso, double valor) {
        /*
         * Classe JadLog: o valor do frete é 7% do valor total do pedido, se peso passar
         * de 2kg, senão o valor é 4,5% do valor do pedido.
         * 
         */
        Frete frete = new Frete();
        frete.setTipoProvedorFrete(TipoProvedorFrete.JADLOG);
        if (peso > 2000) {
            valor = (valor * 0.07);
        } else {
            valor = (valor * 0.045);
        }
        frete.setValor(valor);

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }

}
