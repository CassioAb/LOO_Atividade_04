package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Passageiro extends BasePessoa {

    private int numeroCartao;
    private String documento;
    public int getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public Passageiro(int codigo, String nome, String email, LocalDate dataNascimento, String usuario, String senha,
            String registro, int numeroCartao, String documento) {
        super(codigo, nome, email, dataNascimento, usuario, senha, registro);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }

    
    
}
