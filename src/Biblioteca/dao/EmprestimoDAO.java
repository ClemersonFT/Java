package Biblioteca.dao;

import Biblioteca.entidade.Emprestimo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmprestimoDAO extends BaseDAO {
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
        String sql = "insert into pessoa values(?,?)";
        try (Connection c = c();
             PreparedStatement pre = c.prepareStatement(sql)){
            pre.setString(1,m.getUsuario());
            pre.execute();
        } catch (SQLException e){
            System.out.println("Erro ao inserir linha");
            System.out.println("Erro "+e.getMessage());
        }
    }
}