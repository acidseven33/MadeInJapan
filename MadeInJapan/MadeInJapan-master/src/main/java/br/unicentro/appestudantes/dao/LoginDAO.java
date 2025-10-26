package br.unicentro.appestudantes.dao;

import br.unicentro.appestudantes.model.Login;
import java.sql.*;

public class LoginDAO implements ILogin, IConst {

    @Override
    public void inserir(Login usuario) throws SQLException {
        String sql = "INSERT INTO usuario(nome) VALUES (?)";

        try (Connection conexao = Conexao.getConexao(stringDeConexao, String.valueOf(usuario), senha);
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, usuario.getNome());
            pstmt.executeUpdate();
 }
}
}