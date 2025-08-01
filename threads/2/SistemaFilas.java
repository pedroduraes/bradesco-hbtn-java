
public class SistemaFilas {
    
    public static void main(String[] args) {
        
        Fila fila = new Fila(10);
        Produtor p = new Produtor(fila);
        Consumidor c = new Consumidor(fila);

        p.start();
        c.start();

        try {
            p.join();
            c.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
