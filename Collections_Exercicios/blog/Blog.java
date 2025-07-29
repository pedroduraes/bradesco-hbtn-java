import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Blog {

    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        this.posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        /*
         * retorna um Set com todos autores que possuem pelo menos um post no blog e
         * deve-se retornar a lista de autores ordenados pelo nome.
         */
        List<String> autores = this.posts.stream().sorted((o1, o2) -> {
            return o1.getAutor().compareTo(o2.getAutor());
        }).map(item -> item.getAutor()).distinct().collect(Collectors.toList());
        return new LinkedHashSet<>(autores);
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        /*
         * onde a chave é o nome da categoria, o valor é a quantidade de postagens
         * daquela categoria,
         * deve-se retornar os conjuntos ordenados pelo nome da categoria
         */

        //TreeMap automatically sorts entries by key in natural (ascending) order.
        Map<String, Integer> items = new TreeMap<>();

        for (Post item : posts) {
            items.put(item.getCategoria(),
                    (int) this.posts.stream().filter(p -> p.getCategoria() == item.getCategoria()).count());
        }

        return items;
    }

}
