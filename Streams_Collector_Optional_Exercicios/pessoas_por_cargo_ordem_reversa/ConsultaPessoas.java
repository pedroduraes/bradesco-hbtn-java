import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    /*
     * obterPessoasAgrupadasPorCargoEmOrdemReversa: recebe uma lista de Pessoa e
     * retorna um TreeMap<String, TreeSet<Pessoa>> que:
     * contém o nome do cargo como chave do TreeMap
     * um TreeSet de pessoas daquele cargo como valor do TreeMap.
     * 
     * 
     * A lista de cargos do TreeMap deve estar em ordem reversa.
     * 
     * DICAS: Utilizar Collectors.groupingBy instanciando TreeMap com
     * Comparator.reverseOrder e Collectors.toCollection(TreeSet::new)
     */
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(
            List<Pessoa> pessoas) {

        TreeMap<String, TreeSet<Pessoa>> result = new TreeMap<>(Collections.reverseOrder());

        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo,Collectors.toCollection(TreeSet::new)));

        return result;
    }

}
