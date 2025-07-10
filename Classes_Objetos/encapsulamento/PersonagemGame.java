public class PersonagemGame {

    private int saudeAtual;
    private String nome;

    public PersonagemGame() {
        this.nome = null;
        this.saudeAtual = 0;
    }

    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
