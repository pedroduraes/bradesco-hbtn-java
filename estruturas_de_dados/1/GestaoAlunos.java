import java.util.ArrayList;

public class GestaoAlunos {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public GestaoAlunos() {
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);

    }

    public void excluirAluno(String nomeAluno){
        int index = -1;
        for(int i=0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equals(nomeAluno)) {
                index = i;
            }
        }
        if (index >=0) {
            System.out.println("Aluno excluido: " + alunos.get(index).toString());
            this.alunos.remove(index);
        } else {
            System.out.printf("Aluno %s não localizado para exclusao\n", nomeAluno);	
        }
    }

    public void buscarAluno(String nomeAluno){
        int index = -1;
        for(int i=0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equals(nomeAluno)) {
                index = i;
            }
        }
        if (index >=0) {
            System.out.println("Aluno localizado: " + alunos.get(index).toString());
        } else {
            System.out.printf("Aluno %s não localizado\n", nomeAluno);	
        }
    }

    public void listarAlunos(){
        for(int i=0; i < alunos.size(); i++) {
            System.out.printf("%d - Aluno %s\n", (i+1) ,alunos.get(i).toString());	
            
        }
        
    }

    
}
