import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    /*
     * um Map<String, Map<Integer, Long>> que contém o nome do cargo como chave do primeiro Map
        e um Map que possua a idade e quantidade de pessoas daquela idade e daquele cargo.

     DICA: Utilizar Collectors.groupingBy dentro de Collectors.groupingBy

     */
    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas) {

        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));

    }

    /*
     * um Map<String, Double> que contém o nome do cargo como chave do primeiro Map
        e um Double que possua o salário médio daquele cargo.

        DICA: Utilizar Collectors.averagingDouble

     */
    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoas) {
     
        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.averagingDouble(p -> p.getSalario())));
        
    }

}
