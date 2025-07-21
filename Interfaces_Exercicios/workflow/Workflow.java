import java.util.ArrayList;
import java.util.List;

import atividades.Atividade;

public class Workflow {

    private List<Atividade> items;
    public List<Atividade> getItems() {
        return items;
    }

    public Workflow() {
        items = new ArrayList<>();
    }

    public void registrarAtividade(Atividade atividade) {
        this.items.add(atividade);
    }
    
}
