package br.fiap.entidade;

import br.fiap.conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaDAO {
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public void inserir(Categoria categoria) {
        sql = "insert into java_categoria values (?, ?)"; //esse  modelo vale para insert, update e delete

        try(Connection connection = Conexao.conectar()) {
            ps = connection.prepareStatement(sql);
            ps.setLong(1, categoria.getId_categoria());
            ps.setString(2, categoria.getCategoria());
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir no banco de dados: \n" + e);
        }
    }

}
