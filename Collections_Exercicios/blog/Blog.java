import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Blog {

    private ArrayList<Post> posts;

    public Blog() {
        this.posts =  new ArrayList<>();
    }

    

    public void adicionarPostagem(Post post) {
        this.posts.add(post);
    }



    public Set<String> obterTodosAutores() {
        Set<String> autores = new HashSet<>();
        
    }
    
}
