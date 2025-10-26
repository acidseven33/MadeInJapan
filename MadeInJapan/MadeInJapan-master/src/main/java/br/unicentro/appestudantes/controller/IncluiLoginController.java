package br.unicentro.appestudantes.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;
import br.unicentro.appestudantes.model.Login;
import br.unicentro.appestudantes.dao.LoginDAO;

public class IncluiLoginController {

    @FXML
    private Button btnConf;

    @FXML
    private TextField txtNomEst;

    @FXML
    private void btnConfOnAction(ActionEvent event) {
        String nome = txtNomEst.getText().trim();

        if (nome.isEmpty()) {
            new Alert(Alert.AlertType.WARNING, "Informe o nome do usuário!", ButtonType.OK).showAndWait();
            return;
        }

        Login usuario = new Login();
        usuario.setNome(nome);

        try {
            new LoginDAO().inserir(usuario);
            new Alert(Alert.AlertType.INFORMATION, "Usuário cadastrado com sucesso!", ButtonType.OK).showAndWait();
            txtNomEst.clear();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Erro ao cadastrar usuário!", ButtonType.OK).showAndWait();
            e.printStackTrace();
        }
    }

    @FXML
    private void btnVoltarOnAction(ActionEvent event) {
        Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stageAtual.close();
}
}