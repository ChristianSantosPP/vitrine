package Model;

public class Produto {
    
    private static int quantidade;    
    private String descricao;
    private double valorunit;
    private String nome;
    private String codigo;
    private double desconto;
    private String imagem;
    private String link;
    
    public Produto(){
        quantidade++;
        this.codigo = Integer.toString(quantidade);
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorunit() {
        return valorunit;
    }

    public void setValorunit(double valorunit) {
        this.valorunit = valorunit;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    
    }    
     
    
}
