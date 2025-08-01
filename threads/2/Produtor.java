import java.util.Random;

public class Produtor extends Thread {

    private Fila fila;

    public Produtor(Fila fila) {
        this.fila = fila;
    }

    /*
     * Produtores: Cada produtor deve gerar um número aleatório entre 1 e 100 e
     * adicioná-lo a uma fila compartilhada. Cada produtor deve gerar um número a
     * cada 1 segundo.
     * 
     */
    @Override
    public void run() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a number from 0 to 99, then adds 1 to make it 1 to 100
        System.out.println("Produziu nº: " + randomNumber);
        try {
            Thread.sleep(500);// Simula o tempo para produzir um item
            this.fila.adicionar(randomNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
    }

}
