package br.unicentro.appestudantes.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenusController {

    @FXML private MenuItem menuUsuarioInclui;
    @FXML private MenuItem menuUsuarioAltera;
    @FXML private MenuItem telaVazia;

    @FXML
    void incluiOnAction(ActionEvent event) {
        abrirTela("/br/unicentro/appestudantes/view/incluiLogin.fxml", "Login");
    }

    @FXML
    void telaVaziaOnAction(ActionEvent event) {
        abrirTela("/br/unicentro/appestudantes/view/home.fxml", "Home");
    }

    @FXML
    void alteraOnAction(ActionEvent event) {
        System.out.println("Função de alteração ainda não implementada.");
    }

    private void abrirTela(String caminho, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(caminho));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 600, 400));
            stage.setTitle(titulo);
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
 }
}
}