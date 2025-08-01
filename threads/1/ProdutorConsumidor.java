public class ProdutorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        //Você deve criar as classes Buffer, Produtor, Consumidor e ProdutorConsumidor 
        //e na classe ProdutorConsumidor criar e iniciar as threads do produtor e consumidor

        // Criar e iniciar as threads do produtor e consumidor
        Produtor p = new Produtor(buffer);
        Consumidor c = new Consumidor(buffer);

        p.start();
        c.start();

        try {
            p.join();
            c.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
        


    }
}