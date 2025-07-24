import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        // Título do livro deve possuir pelo menos 3 caracteres, senão Titulo de livro
        // invalido - Exceção: LivroInvalidoException.
        if (titulo == null || titulo.isEmpty() || titulo.length() < 3) {
            
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        // Nome do autor deve possuir pelo menos dois nomes, senão Nome de autor
        // invalido - Exceção: AutorInvalidoException.
        String regex = "[,\\.\\s]";
        if (autor == null || autor.isEmpty() || autor.split(regex).length < 2) {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        // Preço do livro deve ser maior que 0, senão Preco de livro invalido - Exceção:
        // LivroInvalidoException.
        if (preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }

}
