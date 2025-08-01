import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    /*
     * um Map<String, Double> que contém o nome do cargo como chave do primeiro Map
        e um Double que possua o salário médio daquele cargo.

        DICA: Utilizar Collectors.averagingDouble

     */
    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoas) {
     
        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.averagingDouble(p -> p.getSalario())));
        
    }

}
