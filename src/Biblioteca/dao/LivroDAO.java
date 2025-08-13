package Biblioteca.dao;

import Biblioteca.entidade.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO extends BaseDAO {
    public void deletarPeloID(long id){
        String sql = "delete from livro where id_livro = ?";
        try (Connection c = c();
             PreparedStatement pre = c.prepareStatement(sql)){
            pre.setLong(1,id);
            pre.execute();
        } catch (SQLException e){
            System.out.println("Erro ao deletar pelo ID: "+ id);
            System.out.println("Erro "+e.getMessage());
        }
    }
    public void inserir(Livro l){
        String sql = "insert into livro(titulo) values(?)";
        try (Connection c = c();
             PreparedStatement pre = c.prepareStatement(sql)){
            pre.setString(1,l.getTitulo());
            pre.execute();
        } catch (SQLException e){
            System.out.println("Erro ao inserir linha");
            System.out.println("Erro "+e.getMessage());
        }
    }
}