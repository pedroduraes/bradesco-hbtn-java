public class Principal {

    /*
     * Você deve criar uma classe chamada Principal que instancie a classe Contador, criando duas threads para incrementar o contador.
     * Inicie as Threads e imprima o valor final do contador.
     * 

     * Inicie as Threads e imprima o valor final do contador.
     * Valor final do contador: 2000
     * 
     */

     public static void main(String[] args) throws InterruptedException {
        Contador c = new Contador();
        ThreadContador t = new ThreadContador(c);
        ThreadContador t1 = new ThreadContador(c);
        t.run();
        t1.run();
        t1.join();
        System.out.print("Valor final do contador: " + c.getContagem());
     }

}
