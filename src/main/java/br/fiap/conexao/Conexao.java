package br.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private final static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl"; // endereco do BD
    private final static String user = "rm558810";
    private final static String pass = "040204";

    private Conexao() {}

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar no BD\n" + e);
        }
        return null;
    }


}
