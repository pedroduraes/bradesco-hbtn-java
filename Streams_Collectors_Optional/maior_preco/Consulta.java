import java.util.ArrayList;
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
         * Ordene a lista de produtos por preco com order reversa e obtenha o primeiro produto.
         * Utilize Comparator.comparing com reversed
         */
        
        List<Produto> clone = produtos.stream().collect(Collectors.toList());
        
        


         Collections.sort(clone, new Comparator<Produto>() {
            public int compare(Produto o1, Produto o2) {
                return Double.compare(o1.getPreco(), o2.getPreco());
                
            }
         });
         return clone.get(clone.size()-1);
    }
    
}
