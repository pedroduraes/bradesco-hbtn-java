abstract class Armazem<T> implements Armazenavel<T> {
    /*
     * An abstract class in Java is a class that cannot be instantiated directly,
     * meaning you cannot create objects of an abstract class. It serves as a
     * blueprint or a base class for other classes to extend. Abstract classes are
     * declared using the abstract keyword.
     */

    @Override
    public abstract void adicionarAoInventario(String nome, T valor);

    @Override
    public abstract T obterDoInventario(String nome);

}
