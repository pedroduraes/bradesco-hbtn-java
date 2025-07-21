import provedores.*;

public class ProcessadorPedido {

    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;

    }

    public void processar(Pedido pedido) {

        /*
         * Crie o método processar que recebe um pedido como parâmetro, 
         * esse método deve preencher o atributo frete do pedido atráves da chamada de 
         * calcularFrete do provedor de frete do processador de pedido.
         */

        pedido.setFrete(this.provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()));
    }

    public ProvedorFrete getProvedorFrete() {
        return provedorFrete;
    }

    public void setProvedorFrete(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

}
