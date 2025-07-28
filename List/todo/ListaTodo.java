import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws Exception {
        for (Tarefa item : tarefas) {
            if (item.getIdentificador() == tarefa.getIdentificador()) {
                throw new Exception(
                        String.format("Tarefa com identificador %d ja existente na lista", tarefa.getIdentificador()));
            }
        }
        tarefa.modificarDescricao(tarefa.getDescricao());
        this.tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        /*
         * retorna false, se tarefa com identificador passado não for encontrada.
         * retorna true, se foi possível marcar como feita, mesmo que tarefa já
         * estivesse como feita.
         */
        for (Tarefa item : tarefas) {
            if (item.getIdentificador() == identificador) {
                item.setEstahFeita(true);
                return true;
            }
            
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        /*retorna false, se tarefa com identificador passado não for encontrada.
        retorna true, se foi possível marcar como não feita, mesmo que tarefa já estivesse como não feita */
        for (Tarefa item : tarefas) {
            if (item.getIdentificador() == identificador) {
                item.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        //Criar método desfazerTodas, marca todos tarefas como não feitas
        for (Tarefa item : tarefas) {
            this.desfazerTarefa(item.getIdentificador());
        }
    }

    public void fazerTodas() {
        //Criar método desfazerTodas, marca todos tarefas como não feitas
        for (Tarefa item : tarefas) {
            this.marcarTarefaFeita(item.getIdentificador());
        }
    }

    public void listarTarefas() {
        String saida = "[%s]  Id: %d - %s\n";
        for (Tarefa item : tarefas) {
            System.out.printf(saida, (item.isEstahFeita() ? "X" : " "), item.getIdentificador(), item.getDescricao());
        }
    }

}
