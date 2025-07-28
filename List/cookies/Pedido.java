import java.util.ArrayList;

public class Pedido {
    
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie item : cookies) {
            total += item.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int totalItems =  this.obterTotalCaixas();
        this.cookies.removeIf(item -> item.getSabor().equalsIgnoreCase(sabor));
        return totalItems - this.obterTotalCaixas();
    }

}
