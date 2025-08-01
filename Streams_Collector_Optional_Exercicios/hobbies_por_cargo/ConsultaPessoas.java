import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    /*
     * que recebe uma lista de Pessoa e retorna um Map<String, TreeSet<String>> que
     * contém o nome do cargo como chave do primeiro Map e um conjunto de hobbies
     * das pessoas daquele cargo
     * 
     * DICA: Utilizar o método Collectors.flatMapping

     */
    public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> pessoas) {
        
        /*
         * Map<String, Set<LineItem>> itemsByCustomerName
            = orders.stream().collect(
            groupingBy(Order::getCustomerName,
            flatMapping(order -> order.getLineItems().stream(),
                            toSet())));
         */
        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.flatMapping(pessoa -> pessoa.getHobbies().stream(), Collectors.toCollection(TreeSet::new))));

    }

}
