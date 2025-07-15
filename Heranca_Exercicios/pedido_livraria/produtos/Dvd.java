package produtos;

public class Dvd extends Produto{


    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruto);
    }

    public double obterPrecoLiquido() {
        return 0;
    }
    
}
