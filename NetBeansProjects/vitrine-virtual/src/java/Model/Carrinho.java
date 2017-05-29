package Model;

import java.util.List;

public class Carrinho {
    
    private Usuario usuario;
    private List<Item> itens;
    private double valorTotal;
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public List<Item> getItens(){
        return itens;
    }
    
    public void setItens(List<Item> itens){
        this.itens = itens;
    }
    
    public void adicionarItem(Item item) 
    { 
       itens.add(item);
    }
    
    public void removerItem(Item item) 
    {
       itens.remove(item);      
    }

    public double getValorTotal(){
        return valorTotal;
    }
    
    public void setValorTotal(List<Item> itens){
        double valor = 0.0;
        for (Item item : itens) {
            valor = valor + (item.getSubtotal());
        }
        valorTotal = valor;
    }    

}
