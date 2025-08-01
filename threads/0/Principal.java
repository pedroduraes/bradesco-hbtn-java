public class Principal {

    /*
     * Você deve criar uma classe chamada Principal que instancie a classe Contador, criando duas threads para incrementar o contador.
     * Inicie as Threads e imprima o valor final do contador.
     * 

     * Inicie as Threads e imprima o valor final do contador.
     * Valor final do contador: 2000
     * 
     */

     public static void main(String[] args) {
        Contador c = new Contador();
        ThreadContador t = new ThreadContador(c);
        t.run();
        t.run();
        System.out.println("Valor final do contador: " + c.getContagem());
     }

}
