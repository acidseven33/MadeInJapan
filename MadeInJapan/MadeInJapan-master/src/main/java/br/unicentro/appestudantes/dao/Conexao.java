package br.unicentro.appestudantes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConexao(String url, String user, String password) throws SQLException {
        return DriverManager.getConnection(url, user, password);
}
}