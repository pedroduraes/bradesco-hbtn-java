
public class SistemaFilas {
    
    public static void main(String[] args) {
        
        Fila fila = new Fila(10);
        
        Produtor p1 = new Produtor(fila);
        Produtor p2 = new Produtor(fila);
        
        Consumidor c1 = new Consumidor(fila);
        Consumidor c2 = new Consumidor(fila);

        p1.start();
        p2.start();
        c1.start();
        c2.start();

        try {
            p1.join();
            p2.join();
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
