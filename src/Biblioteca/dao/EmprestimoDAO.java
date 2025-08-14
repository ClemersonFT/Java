package Biblioteca.dao;

import Biblioteca.entidade.Emprestimo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmprestimoDAO extends BaseDAO {

    public long qunatidadeDeLivrosEmprestados(long id){
        String sql = "SELECT Count(*) FROM Emprestimo WHERE id_usuario = ? AND dataEfetivaDeDevolucao = NULL";
        try (Connection c = c();
             PreparedStatement pre = c.prepareStatement(sql)){
            pre.setLong(1,id);
            try (ResultSet rs = pre.executeQuery()) {
                return rs.next() ? rs.getLong(1) : 0L;
            }
        } catch (SQLException e){
            System.out.println("Erro ao contar a quantidade de emprestimo do usuario= "+ id);
            System.out.println("Erro "+e.getMessage());
            return 0L;
        }
    }
    public void deletarPeloID(long id){
        String sql = "delete from emprestimo where id_emprestimo = ?";
        try (Connection c = c();
             PreparedStatement pre = c.prepareStatement(sql)){
            pre.setLong(1,id);
            pre.execute();
        } catch (SQLException e){
            System.out.println("Erro ao deletar pelo ID: "+ id);
            System.out.println("Erro "+e.getMessage());
        }
    }
    public void inserir(Emprestimo m){
        String sql = "insert into emprestimo(usuario,livroid,dataDoEmprestimo,dataPrevistaDeDevolucao,dataEfetivaDeDevolucao) values(?,?,?,?,?)";
        try (Connection c = c();
             PreparedStatement pre = c.prepareStatement(sql)){
            pre.setString(1,m.getUsuario());
            pre.setLong(2,m.getLivroid());
            pre.setTimestamp(3,m.getDataDoEmprestimo());
            pre.setTimestamp(4,m.getDataPrevistaDeDevolucao());
            pre.setTimestamp(5,m.getDataEfetivaDeDevolucao());
            pre.execute();
        } catch (SQLException e){
            System.out.println("Erro ao inserir linha");
            System.out.println("Erro "+e.getMessage());
        }
    }
}