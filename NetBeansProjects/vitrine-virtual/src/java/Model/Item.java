package Model;

public class Item {
    private Produto produto;
    private int quantidade;
    private double subtotal;
     
    public double calcularSubtotal() {
    subtotal= produto.getValorunit()*quantidade;
    return subtotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        incrementar();
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal() {
        double valorUnitario = (double) this.produto.getValorunit();
        this.subtotal = quantidade * valorUnitario;
    }
    
    public void incrementar() {
        quantidade++;
        this.setSubtotal();
    }
    
    
}
