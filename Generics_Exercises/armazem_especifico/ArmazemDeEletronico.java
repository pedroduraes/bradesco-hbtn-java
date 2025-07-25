import java.util.HashMap;
import java.util.Map;

public class ArmazemDeEletronico extends Armazem<Eletronico>{

    private Map<String, Eletronico> items = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, Eletronico valor) {
        this.items.put(nome, valor);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return this.items.get(nome);
    }
    
}
