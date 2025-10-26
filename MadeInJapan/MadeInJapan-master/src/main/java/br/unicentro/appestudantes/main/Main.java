package br.unicentro.appestudantes.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/unicentro/appestudantes/view/menus.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("Loja de Carros");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void mudarTela(Scene novaCena) {
        mainStage.setScene(novaCena);
    }

    public static void main(String[] args) {
        launch(args);
}
}