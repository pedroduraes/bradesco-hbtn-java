package produtos;

public class Livro extends Produto {

    private int paginas;
    private String autor;
    private int edicao;

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, precoBruto);
    }

    public double obterPrecoLiquido() {
        //Livros: o cálculo de seu preço líquido é seu preço bruto com acréscimo de 15%
        double valor = this.getPrecoBruto();
        return  valor + (valor * 0.15);
    }

}
