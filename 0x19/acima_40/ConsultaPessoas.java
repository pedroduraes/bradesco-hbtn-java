import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas) {
        /*
         * obterPessoasPorCargo: recebe uma lista de Pessoa e retorna um Map<String,
         * List<Pessoa>> que contém o nome do cargo como chave do Map e a lista de
         * pessoas daquele cargo como valor do Map.
         * 
         * DICA: Utilize Collectors.groupingBy
         * 
         * Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
         * .collect(groupingBy(BlogPost::getType));
         */
        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo));
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> pessoas) {
        /*
         * obterIdadePorCargo: recebe uma lista de Pessoa e retorna um Map<String,
         * List<Integer>> que contém o nome do cargo como chave do Map e a lista de
         * idades de pessoas daquele cargo como valor do Map.
         * 
         * DICA: Utilizar Collectors.mapping
         * Map<City, Set<String>> lastNamesByCity
         * = people.stream().collect(
         * groupingBy(Person::getCity,
         * mapping(Person::getLastName,
         * toSet())));
         */
        return pessoas.stream().collect(
                Collectors.groupingBy(Pessoa::getCargo, Collectors.mapping(Pessoa::getIdade, Collectors.toList())));

    }

    public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> pessoas) {
        /*
         * obterPessoasPorCargoAcimaDe40anos: recebe uma lista de Pessoa e retorna um
         * Map<String, List<Pessoa>> que contém o nome do cargo como chave do Map e a
         * lista de pessoas daquele cargo e que possuam idade acima de 40 anos como
         * valor do Map.
         * 
         * DICA: Utilizar Collectors.filtering
         * 
         * Map<Department, Set<Employee>> wellPaidEmployeesByDepartment
            = employees.stream().collect(
            groupingBy(Employee::getDepartment,
            filtering(e -> e.getSalary() > 2000,
            toSet())));


         */
        return  pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.filtering(p -> p.getIdade() >=40, Collectors.toList()))) ;
    }
}
