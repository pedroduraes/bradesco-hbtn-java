import java.util.HashMap;
import java.util.Map;

public class ArmazemDeComida extends Armazem<Comida>  {

    private Map<String, Comida> items = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, Comida valor) {
        this.items.put(nome, valor);
    }

    @Override
    public Comida obterDoInventario(String nome) {
        return this.items.get(nome);
    }
    
}
