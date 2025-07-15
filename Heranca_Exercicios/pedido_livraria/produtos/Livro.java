package Heranca_Exercicios.pedido_livraria.produtos;
public class Livro extends Produto{

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, precoBruto);
    }

    

    public double obterPrecoLiquido() {
        return 0;
    }
    
}
