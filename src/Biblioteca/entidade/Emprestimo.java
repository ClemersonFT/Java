package Biblioteca.entidade;

import java.time.LocalDateTime;

public class Emprestimo {
    private long id;
    private String usuario;
    private long livroid;
    private LocalDateTime dataDoEmprestimo;
    private LocalDateTime dataPrevistaDeDevolucao;
    private LocalDateTime dataEfetivaDeDevolucao;

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

    public LocalDateTime getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(LocalDateTime dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public LocalDateTime getDataPrevistaDeDevolucao() {
        return dataPrevistaDeDevolucao;
    }

    public void setDataPrevistaDeDevolucao(LocalDateTime dataPrevistaDeDevolucao) {
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
    }

    public LocalDateTime getDataEfetivaDeDevolucao() {
        return dataEfetivaDeDevolucao;
    }

    public void setDataEfetivaDeDevolucao(LocalDateTime dataEfetivaDeDevolucao) {
        this.dataEfetivaDeDevolucao = dataEfetivaDeDevolucao;
    }
}
