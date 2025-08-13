package Biblioteca.dao;
import Biblioteca.entidade.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO extends BaseDAO {
    public void deletarPeloID(long id){
        String sql = "delete from usuario where id_usuario = ?";
        try (Connection c = c();
             PreparedStatement pre = c.prepareStatement(sql)){
            pre.setLong(1,id);
            pre.execute();
        } catch (SQLException e){
            System.out.println("Erro ao deletar pelo ID: "+ id);
            System.out.println("Erro "+e.getMessage());
        }
    }
    public void inserir(Usuario u){
        String sql = "insert into usuario(nome,email) values(?,?)";
        try (Connection c = c();
             PreparedStatement pre = c.prepareStatement(sql)){
            pre.setString(1,u.getNome());
            pre.setString(2,u.getEmail());
            pre.execute();
        } catch (SQLException e){
            System.out.println("Erro ao inserir linha");
            System.out.println("Erro "+e.getMessage());
        }
    }
}