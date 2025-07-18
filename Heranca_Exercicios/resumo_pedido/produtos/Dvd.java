package produtos;

public class Dvd extends Produto{


    private String diretor;
    private String genero;
    private int duracao;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruto);
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    public double obterPrecoLiquido() {
        //DVDs: o cálculo de seu preço líquido é seu preço bruto com acréscimo de 20%
        double valor = this.getPrecoBruto();
        return  valor + (valor * 0.20);
    }
    
}
