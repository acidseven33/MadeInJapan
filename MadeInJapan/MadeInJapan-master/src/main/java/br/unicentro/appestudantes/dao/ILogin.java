package br.unicentro.appestudantes.dao;

import br.unicentro.appestudantes.model.Login;
import java.sql.SQLException;

public interface ILogin {
    void inserir(Login usuario) throws SQLException;
}