import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream().filter((p) -> p.getCategoria() == CategoriaProduto.LIVRO).toList();
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        /*
         * Ordene a lista de produtos por preco com order reversa e obtenha o primeiro
         * produto.
         * Utilize Comparator.comparing com reversed
         */

        List<Produto> clone = produtos.stream().collect(Collectors.toList());

        Collections.sort(clone, new Comparator<Produto>() {
            public int compare(Produto o1, Produto o2) {
                return Double.compare(o1.getPreco(), o2.getPreco());

            }
        });
        return clone.get(clone.size() - 1);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        /*
         * Inclua o método estático obterProdutosPorPrecoMinimo a classe Consulta que
         * recebe uma lista de produtos e um preço mínimo.
         * Esse método deve retornar os produtos que possuem preço maior ou igual ao
         * preço mínimo passado por parâmetro.
         * 
         */

        return produtos.stream().filter((p) -> p.getPreco() >= precoMinimo).collect(Collectors.toList());

    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        /*
         * Inclua o método estático obterPedidosComEletronicos a classe Consulta que
         * recebe uma lista de pedidos
         * e retorna apenas os pedidos que possuem produtos que sejam da categoria
         * Eletronico.
         */
        return pedidos
                .stream().filter((p) -> p.getProdutos().stream()
                        .filter((x) -> x.getCategoria() == CategoriaProduto.ELETRONICO).count() > 0)
                .collect(Collectors.toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        /*
         * Inclua o método estático aplicar15PorcentoDescontoEletronicos na classe
         * Consulta que :
         * recebe uma lista de produtos e retorna todos os produtos,
         * porém os produtos que sejam eletronicos deve estar com 15% de desconto
         * aplicado no preço.
         */

        return produtos.stream().map((x) -> new Produto(x.getCodigo(), x.getNome(), x.getCategoria(),
                x.getCategoria() == CategoriaProduto.ELETRONICO ? x.getPreco() - (x.getPreco() * 0.15) : x.getPreco()))
                .collect(Collectors.toList());
    }

}
