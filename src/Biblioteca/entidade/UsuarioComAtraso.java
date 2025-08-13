package Biblioteca.entidade;

public class UsuarioComAtraso extends Usuario{
    private long quantidadeDeLivrosAtrasados;

    public long getQuantidadeDeLivrosAtrasados() {
        return quantidadeDeLivrosAtrasados;
    }

    public void setQuantidadeDeLivrosAtrasados(long quantidadeDeLivrosAtrasados) {
        this.quantidadeDeLivrosAtrasados = quantidadeDeLivrosAtrasados;
    }
}
