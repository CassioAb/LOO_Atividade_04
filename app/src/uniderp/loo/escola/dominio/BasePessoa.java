package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoa {

    protected int codigo;
    protected String nome;
    protected String email;
    protected LocalDate dataNascimento;
    protected String usuario;
    protected String senha;
    protected String registro;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public BasePessoa(int codigo, String nome, String email, LocalDate dataNascimento, String usuario, String senha,
            String registro) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.usuario = usuario;
        this.senha = senha;
        this.registro = registro;
    }
    
    

}
