import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> {

    private List<T> items = new ArrayList<>();

    public void adicionarMidia(T item) {
        this.items.add(item);
    }

    public String obterListaMidias() {
        return items.toString();
    }
}
