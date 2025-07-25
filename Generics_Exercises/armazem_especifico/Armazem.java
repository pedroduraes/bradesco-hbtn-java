abstract class Armazem<T> implements Armazenavel<T>{

    @Override
    public abstract void adicionarAoInventario(String nome, T valor);

    @Override
    public abstract T obterDoInventario(String nome);
    
}
