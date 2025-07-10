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

    public void tomarDano(int quantidadeDeDano) {
        this.saudeAtual -= quantidadeDeDano;
        if (this.saudeAtual < 0) {
            this.saudeAtual = 0;
        }
    }

    public void receberCura(int quantidadeDeCura) {
        this.saudeAtual += quantidadeDeCura;
        if (this.saudeAtual > 100) {
            this.saudeAtual = 100;
        }
    }

}
