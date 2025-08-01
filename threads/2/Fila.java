import java.util.LinkedList;

public class Fila {

    private LinkedList<Integer> lista;
    private int maxItems = 10;

    public Fila() {
        lista = new LinkedList<>();
        System.out.println("Inicializando lista com: " + lista.size());
    }

    /*
     * Fila: A fila tem uma capacidade limitada (exemplo: capacidade de 10
     * elementos). Se a fila estiver cheia, os produtores devem esperar até que haja
     * espaço disponível. Se a fila estiver vazia, os consumidores devem esperar até
     * que haja um item para consumir.
     * 
     */


     /*
      * A fila é representada por um LinkedList e tem uma capacidade limitada.
        O método adicionar(int item) adiciona um item à fila. 
            Se a fila estiver cheia, o produtor chama wait() para aguardar até que o consumidor remova um item e crie espaço na fila.
      */

      public synchronized void adicionar(int item) throws InterruptedException {
        while (this.lista.size() > this.maxItems) {
            wait();
        }
        System.out.println("adicionando item: " + item);
        this.lista.add(item);
        notify();
      }

      /*
        O método retirar() retira um item da fila. 
            Se a fila estiver vazia, o consumidor chama wait() e aguarda até que o produtor adicione um item à fila.
       */
      public synchronized int retirar() throws InterruptedException {
        
        while (this.lista.size() == 0) {
            wait();            
        }
      

        int index = -1;
        for(int i =0; i < this.lista.size(); i ++) {
          if (this.lista.get(i) != null) {
            index = i;
          }
        }

        System.out.println("removendo item da posicao " + index);
        int valor = this.lista.get(index);
        //this.lista.remove(0);
        this.lista.set(0, null);
        notify();
        return valor;
      }

}
