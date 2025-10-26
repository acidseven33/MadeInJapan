package br.unicentro.appestudantes.controller;



import br.unicentro.appestudantes.main.Main;
import br.unicentro.appestudantes.model.Carro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

public class HomeController {

    @FXML
    private ListView<Carro> listViewCarros;

    @FXML
    private Button btnFavoritos;

    private ObservableList<Carro> carrosLoja;
    private static ObservableList<Carro> listaFavoritos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        carrosLoja = FXCollections.observableArrayList(
                new Carro("Toyota", "Trueno Sprinter Trueno AE86", 1983, 20000),
                new Carro("Toyota", "Chaser", 1977, 30000),
                new Carro("Toyota", "Supra", 1978, 57000),
                new Carro("Toyota", "Land Cruiser 70", 1984, 20000),
                new Carro("Nissan", "Skyline R32", 1989, 50000),
                new Carro("Nissan", "Silvia", 1988, 15000),
                new Carro("Nissan", "Fairlady Z", 1969, 42970),
                new Carro("Nissan", "180SX", 1983, 42000),
                new Carro("Mazda", "RX-7", 1991, 27841),
                new Carro("Mazda", "MX-5 Miata", 2005, 19000),
                new Carro("Mazda", "RX-8", 2012, 20000),
                new Carro("Mazda", "Familia GT-X", 1990, 9888) );

        listViewCarros.setItems(carrosLoja);
        listViewCarros.setCellFactory(param -> new CarroCell());
    }

    @FXML
    private void abrirFavoritos() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/unicentro/appestudantes/view/favoritos.fxml"));
            BorderPane root = loader.load();

            FavoritosController controller = loader.getController();
            controller.setListaFavoritos(listaFavoritos);

            Scene cenaFavoritos = new Scene(root);
            Main.mudarTela(cenaFavoritos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnVoltarOnAction(ActionEvent actionEvent) {
    }

    // Classe interna para customizar as células da ListView
    private class CarroCell extends javafx.scene.control.ListCell<Carro> {
        private Button btnFavoritar = new Button("⭐ Favoritar");

        public CarroCell() {
            btnFavoritar.setOnAction(event -> {
                Carro carro = getItem();
                if (carro != null && !listaFavoritos.contains(carro)) {
                    listaFavoritos.add(carro);
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
                setGraphic(btnFavoritar);
            }
 }
}
}