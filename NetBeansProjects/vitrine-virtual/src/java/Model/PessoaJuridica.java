package Model;

public class PessoaJuridica{
        
    private long idusuario;
    private String razaoSocial;
    private String cnpj;
    private Usuario usuario;

    public long getIdUsuario() {
        return idusuario;
    }

    public void setIdUsuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
     public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }    
}
