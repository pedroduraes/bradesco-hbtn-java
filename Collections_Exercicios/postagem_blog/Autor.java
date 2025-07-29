public class Autor implements Comparable<Autor>{
    
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    @Override
    public String toString() {
        return String.format("%s %s", this.nome, this.sobrenome);
    }

    @Override
    public int compareTo(Autor arg0) {
        return this.toString().compareTo(arg0.toString());
    }

    
}
