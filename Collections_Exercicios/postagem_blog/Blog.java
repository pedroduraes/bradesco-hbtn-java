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

    public void adicionarPostagem(Post post) throws Exception {
        /*
         *  deve verificar se postagem já foi adicionada, 
         * essa comparação deve ser feita da seguinte forma: mesmo autor com mesmo título, 
         * se já houver, deve lançar uma exceção com mensagem Postagem jah existente
         */
        if (this.posts.stream().filter(item -> item.getAutor().toString().equals(post.getAutor().toString()) && item.getTitulo().equals(post.getTitulo())).collect(Collectors.toList()).size() > 0) {
            throw new Exception("Postagem jah existente");
        }
        this.posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        /*
         * retorna um Set com todos autores que possuem pelo menos um post no blog e
         * deve-se retornar a lista de autores ordenados pelo nome.
         */
        List<Autor> autores = this.posts.stream().sorted((o1, o2) -> {
            return o1.getAutor().toString().compareTo(o2.getAutor().toString());
        }).map(item -> item.getAutor()).distinct().collect(Collectors.toList());
        return new LinkedHashSet<>(autores);
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        /*
         * onde a chave é o nome da categoria, o valor é a quantidade de postagens
         * daquela categoria,
         * deve-se retornar os conjuntos ordenados pelo nome da categoria
         */

        //TreeMap automatically sorts entries by key in natural (ascending) order.
        Map<Categorias, Integer> items = new TreeMap<>();

        for (Post item : posts) {
            items.put(item.getCategoria(),
                    (int) this.posts.stream().filter(p -> p.getCategoria() == item.getCategoria()).count());
        }

        return items;
    }

    public Set<Post> obterPostsPorCategoria(Categorias cat) {
        // recebe uma categoria como parâmetro e retorna um Set de posts daquela categoria, deve-se retornar os posts ordenados pelo título
        
        List<Post> posts = this.posts.stream().filter(item -> item.getCategoria().equals(cat)) .sorted((o1, o2) -> {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }).collect(Collectors.toList());
        return new LinkedHashSet<>(posts);

    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        // recebe um autor como parâmetro e retorna um Set de posts daquele autor, deve-se retornar os posts ordenados pelo título
        List<Post> posts = this.posts.stream().filter(item -> item.getAutor().toString().equals(autor.toString())) .sorted((o1, o2) -> {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }).collect(Collectors.toList());
        return new LinkedHashSet<>(posts);
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        //retorne uma Map que a chave seja Categorias e o valor seja um Set com todos posts daquela categoria
        Map<Categorias, Set<Post>> postsPorCategoria = new TreeMap<>();
        for (Post item : posts) {
            postsPorCategoria.put(item.getCategoria(), this.obterPostsPorCategoria(item.getCategoria()));
        }

        return postsPorCategoria;
        
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        //retorne uma Map que a chave seja Autor e o valor seja um Set com todos posts daquela categoria
        Map<Autor, Set<Post>> postsPorAutor = new TreeMap<>();

        for (Post item : posts) {
            postsPorAutor.put(item.getAutor(), this.obterPostsPorAutor(item.getAutor()));
        }

        return postsPorAutor;
    }

}
