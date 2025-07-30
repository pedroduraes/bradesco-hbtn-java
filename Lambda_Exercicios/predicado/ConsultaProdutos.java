import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criterioFiltro) {

        return produtos.stream().filter((p) -> criterioFiltro.test(p)).collect(Collectors.toList());
        /*
         * List<Produto> items = new ArrayList<>();
         * for (Produto p : produtos) {
         * if (criterioFiltro.test(p)) {
         * items.add(p);
         * }
         * }
         * return items;
         * 
         * 
         */

    }
}
