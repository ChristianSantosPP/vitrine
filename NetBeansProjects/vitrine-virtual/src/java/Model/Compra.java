package Model;

import java.util.Date;

public class Compra {
    private Date data;
    private Date hora;
    private String status;
    private Carrinho carrinho;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Carrinho getCarrinho(){
        return carrinho;
    }
    
    public void setCarrinho(Carrinho carrinho){
        this.carrinho = carrinho;
    }
    
}
