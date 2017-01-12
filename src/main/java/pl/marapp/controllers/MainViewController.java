package pl.marapp.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import pl.marapp.I18nBundle;

public class MainViewController {

    @FXML
    private void initialize() {
    }

    @FXML
    private void closeApp(){
        System.exit(0);
    }

    @FXML
    private void handleAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        I18nBundle i18nBundle = I18nBundle.getInstance();
        alert.setTitle("appTitle");
        alert.setHeaderText(i18nBundle.getValue("menuItem.about"));
        alert.setContentText("Szymon Walkowski");
        alert.showAndWait();
    }

}
