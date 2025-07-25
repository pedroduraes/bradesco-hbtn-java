import java.util.HashMap;
import java.util.Map;

public class Armazem<T> implements Armazenavel<T>{

    private Map<String, T> items = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        this.items.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return this.items.get(nome);
    }
  
    
}
