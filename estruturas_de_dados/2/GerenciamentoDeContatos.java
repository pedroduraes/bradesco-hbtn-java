import java.util.HashMap;
import java.util.Map;


public class GerenciamentoDeContatos {
    private Map<String, Contato> contatos;


    // Construtor
    public GerenciamentoDeContatos() {
        contatos = new HashMap<>();
    }


    // Adiciona um novo contato
    public void adicionarContato(String nome, String telefone, String email) {
    // IMPLEMENTE ESTE METODO
    if (!this.contatos.containsKey(nome)) {
        Contato contato = new Contato();
        contato.adicionarTelefone(telefone);
        contato.adicionarEmail(email);
        this.contatos.put(nome, contato);
        System.out.printf("Contato %s adicionado com sucesso!\n", nome);

    } else {
        System.out.printf("Erro: Contato com nome %s já existe!\n", nome);
    }
    }


    // Exibe todos os contatos
    public void exibirContatos() {
        this.contatos.forEach((key, value) -> {
            System.out.printf("Nome: %s\n",key);
            System.out.printf("Telefones: %s\n",value.getTelefones());
            System.out.printf("Emails: %s\n",value.getEmails());
            System.out.println("-------------------------------");   
        });
    }


    // Busca um contato pelo nome
    public void buscarContato(String nome) {
        Contato item = contatos.get(nome);
        if (item != null) {
            System.out.printf("Contato encontrado: %s\n",nome);
            System.out.printf("Telefones: %s\n",item.getTelefones());
            System.out.printf("Emails: %s\n",item.getEmails());
        } else {
            //System.out.printf("Erro: Contato com nome %s não existe!\n", nome);
        }
    }


    // Remove um contato pelo nome
    public void removerContato(String nome) {
        Contato item = contatos.get(nome);
        if (item != null) {
            this.contatos.remove(nome);
            System.out.printf("Contato %s removido com sucesso!\n", nome);
        } else {
            System.out.printf("Contato %s não encontrado.!\n", nome);
        }
    }


    public static void main(String[] args) {
        GerenciamentoDeContatos gestao = new GerenciamentoDeContatos();


        // Adicionando contatos
        gestao.adicionarContato("Carlos", "1234-5678", "carlos@email.com");
        gestao.adicionarContato("Maria", "8765-4321", "maria@email.com");
        gestao.adicionarContato("Ana", "1122-3344", "ana@email.com");
        gestao.adicionarContato("Carlos", "1234-5678", "carlos@email.com"); // Tentando duplicar


        // Exibindo todos os contatos
        System.out.println("\nExibindo todos os contatos:");
        gestao.exibirContatos();


        // Buscando um contato
        System.out.println("\nBuscando contato 'Maria':");
        gestao.buscarContato("Maria");


        // Removendo um contato
        System.out.println("\nRemovendo contato 'Carlos':");
        gestao.removerContato("Carlos");


        // Tentando remover um contato inexistente
        System.out.println("\nTentando remover contato 'João' que não existe:");
        gestao.removerContato("João");


        // Exibindo todos os contatos após remoções
        System.out.println("\nExibindo todos os contatos após remoções:");
        gestao.exibirContatos();
    }
}