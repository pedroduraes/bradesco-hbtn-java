public class PersonagemGame {

    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame() {
        this.nome = null;
        this.saudeAtual = 0;
        this.status = null;
    }

    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual > 0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getStatus() {
        return this.status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void tomarDano(int quantidadeDeDano) {
        if (this.getSaudeAtual() - quantidadeDeDano <= 0) {
            this.setSaudeAtual(0);
        } else {
            this.setSaudeAtual(this.getSaudeAtual() - quantidadeDeDano);
        }
        
    }

    public void receberCura(int quantidadeDeCura) {
        if (this.getSaudeAtual() + quantidadeDeCura >= 100) {
            this.setSaudeAtual(100);
        } else {
            this.setSaudeAtual(this.getSaudeAtual() + quantidadeDeCura);
        }
        
    }

}
