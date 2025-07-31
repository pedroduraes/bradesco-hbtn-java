import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    /*
     * obterContagemPessoasPorCargo: recebe uma lista de Pessoa e retorna um
     * Map<String, Long> que contém o nome do cargo como chave do Map e a quantidade
     * de pessoas daquele cargo como valor do Map.
     * 
     * DICA: Utilizar Collectors.counting
     * 
     */

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {

        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
        
    }

}
