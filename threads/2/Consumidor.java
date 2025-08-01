
public class Consumidor extends Thread {

    private Fila fila;
    public Consumidor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        
        try {
            int valorProcessado = fila.retirar();
            Thread.sleep(500);// Simula o tempo para produzir um item
            System.out.println("retirando item: " + valorProcessado);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
