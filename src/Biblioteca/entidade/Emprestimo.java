package Biblioteca.entidade;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Emprestimo {
    private long id;
    private String usuario;
    private long livroid;
    private Timestamp dataDoEmprestimo;
    private Timestamp dataPrevistaDeDevolucao;
    private Timestamp dataEfetivaDeDevolucao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public long getLivroid() {
        return livroid;
    }

    public void setLivroid(long livroid) {
        this.livroid = livroid;
    }

    public Timestamp getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(Timestamp dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public Timestamp getDataPrevistaDeDevolucao() {
        return dataPrevistaDeDevolucao;
    }

    public void setDataPrevistaDeDevolucao(Timestamp dataPrevistaDeDevolucao) {
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
    }

    public Timestamp getDataEfetivaDeDevolucao() {
        return dataEfetivaDeDevolucao;
    }

    public void setDataEfetivaDeDevolucao(Timestamp dataEfetivaDeDevolucao) {
        this.dataEfetivaDeDevolucao = dataEfetivaDeDevolucao;
    }
}
