import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro{

    public LivroEdicaoOuro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        super(titulo, autor, preco);
    }

    @Override
    public double getPreco() {
        //Deve sobrescrever o método getPreco() para aplicar 30% de acrescimo ao preço do livro.
        double value = super.getPreco();
        value += value * 0.30;
        return value;
    }
    
    
}
