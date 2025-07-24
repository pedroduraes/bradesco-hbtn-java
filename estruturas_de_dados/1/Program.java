public class Program {

    public static void main(String[] args) {
        /*
         * Ao executar o programa, ele realizará as operações seguintes:
         * 
         * Adicionará três alunos.
         * Exibirá a lista de alunos.
         * Buscará por um aluno.
         * Excluirá um aluno.
         * Tentará excluir um aluno inexistente e buscará outro aluno.
         */

        GestaoAlunos gestao = new GestaoAlunos();
        gestao.adicionarAluno(new Aluno("Pedro", 40));
        gestao.adicionarAluno(new Aluno("Maria", 20));
        gestao.adicionarAluno(new Aluno("João", 10));

        gestao.listarAlunos();
        gestao.buscarAluno("Pedro");
        gestao.excluirAluno("Maria");
        gestao.excluirAluno("Maria");
        gestao.buscarAluno("João");

    }

}
