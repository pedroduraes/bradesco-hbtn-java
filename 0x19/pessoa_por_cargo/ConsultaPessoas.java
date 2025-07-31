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

         Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
        .collect(groupingBy(BlogPost::getType));
         */
        return  pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo)) ;
    }

}
