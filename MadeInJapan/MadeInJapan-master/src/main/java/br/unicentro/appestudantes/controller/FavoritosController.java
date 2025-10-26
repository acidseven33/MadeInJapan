package br.unicentro.appestudantes.controller;

import br.unicentro.appestudantes.main.Main;
import br.unicentro.appestudantes.model.Carro;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

public class FavoritosController {

    @FXML
    private ListView<Carro> listViewFavoritos;

    private ObservableList<Carro> listaFavoritos;

    public void setListaFavoritos(ObservableList<Carro> listaFavoritos) {
        this.listaFavoritos = listaFavoritos;
        listViewFavoritos.setItems(listaFavoritos);
        listViewFavoritos.setCellFactory(param -> new FavoritoCell());
    }

    private class FavoritoCell extends javafx.scene.control.ListCell<Carro> {
        private final Button btnRemover = new Button("❌ Remover");

        public FavoritoCell() {
            btnRemover.setOnAction(event -> {
                Carro carro = getItem();
                if (carro != null) {
                    listaFavoritos.remove(carro);
                }
            });
        }

        @Override
        protected void updateItem(Carro carro, boolean vazio) {
            super.updateItem(carro, vazio);
            if (vazio || carro == null) {
                setText(null);
                setGraphic(null);
            } else {
                setText(carro.toString());
                setGraphic(btnRemover);
            }
        }
    }

    @FXML
    private void voltarHome() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/unicentro/appestudantes/view/favoritos.fxml"));
            BorderPane root = loader.load();
            Scene cenaHome = new Scene(root);
            Main.mudarTela(cenaHome);
        } catch (Exception e) {
            e.printStackTrace();
 }
}
}