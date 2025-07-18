import produtos.Dvd;
import produtos.Livro;
import produtos.Produto;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;
        Produto prod;
        for (ItemPedido itemPedido : itens) {
            prod = itemPedido.getProduto();
            if (prod instanceof Dvd) {
                total += itemPedido.getQuantidade() * ((Dvd) prod).obterPrecoLiquido();   
            } else {
                total += itemPedido.getQuantidade() * ((Livro) prod).obterPrecoLiquido();   
            }
            
        }
        if (this.percentualDesconto > 0) {
            // Calcula o valor do desconto
            double desconto = total * (this.percentualDesconto / 100);

            // Calcula o preço com desconto
            total = total - desconto;
        }
        return total;
    }

}
