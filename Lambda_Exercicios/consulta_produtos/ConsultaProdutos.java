import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {

        return produtos.stream().filter((p) -> criterioFiltro.testar(p)).collect(Collectors.toList());
        /*
         * List<Produto> items = new ArrayList<>();
         * for (Produto p : produtos) {
         * if (criterioFiltro.testar(p)) {
         * items.add(p);
         * }
         * }
         * return items;
         * 
         * 
         */

    }
}
