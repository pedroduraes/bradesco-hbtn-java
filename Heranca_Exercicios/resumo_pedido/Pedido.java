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

    public void apresentarResumoPedido() {

        StringBuilder sb = new StringBuilder("------- RESUMO PEDIDO -------\n");
        // Tipo: Livro Titulo: Um de nos esta mentindo Preco: 40,17 Quant: 1 Total: 40,17
        // Tipo: Dvd Titulo: Anjos da Noite 5 - Guerras de Sangue Preco: 20,28 Quant: 1 Total: 20,28

        double total = 0;
        double totalComDescontos = 0;
        double descontos = 0;
        String saidaProd = "";
        Dvd dvd;
        Livro livro;
        double valorProdutos = 0;
        for (ItemPedido itemPedido : itens) {
            
            if (itemPedido.getProduto() instanceof Dvd) {
                dvd = ((Dvd) itemPedido.getProduto());
                total += itemPedido.getQuantidade() * dvd.obterPrecoLiquido();
                saidaProd = String.format("Tipo: Dvd  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n", dvd.getTitulo(), dvd.obterPrecoLiquido(), itemPedido.getQuantidade(), itemPedido.getQuantidade() * dvd.obterPrecoLiquido());
                valorProdutos = itemPedido.getQuantidade() * dvd.obterPrecoLiquido();;
            } else {
                livro = ((Livro) itemPedido.getProduto());
                total += itemPedido.getQuantidade() * livro.obterPrecoLiquido();
                saidaProd = String.format("Tipo: Livro  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n", livro.getTitulo(), livro.obterPrecoLiquido(),itemPedido.getQuantidade() , itemPedido.getQuantidade() * livro.obterPrecoLiquido());
                valorProdutos = itemPedido.getQuantidade() * livro.obterPrecoLiquido();;
            }
            sb.append(saidaProd);

            if (this.percentualDesconto > 0) {
                // Calcula os descontos
                descontos += valorProdutos * (this.percentualDesconto / 100);
            }


        }
        sb.append("----------------------------\n");
        sb.append(String.format("DESCONTO: %.2f\n", descontos));
        sb.append(String.format("TOTAL PRODUTOS: %.2f\n", total));
        sb.append("----------------------------\n");
        sb.append(String.format("TOTAL PEDIDO: %.2f\n", total-descontos));
        sb.append("----------------------------");

        System.out.println(sb.toString());
    }

}
