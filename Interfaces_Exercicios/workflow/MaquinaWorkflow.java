import atividades.Atividade;

public class MaquinaWorkflow {

    public MaquinaWorkflow() {

    }

    public void executar(Workflow workflow) {
        for (Atividade item : workflow.getItems()) {
            item.executar();            
        }

    }
    
}
