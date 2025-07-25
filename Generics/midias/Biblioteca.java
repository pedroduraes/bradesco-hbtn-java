import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> extends Midia {

    public Biblioteca() {
            super(null);
            //TODO Auto-generated constructor stub
        }
    
        private List<T> items = new ArrayList<>();

    public void adicionarMidia(T item) {
        this.items.add(item);
    }

    public String obterListaMidias() {
        return items.toString();
    }
}
