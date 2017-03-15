package pl.marapp;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.marapp.properties.Locales;
import pl.marapp.properties.WindowProps;
import pl.marapp.properties.WindowUrlProvider;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
        I18nBundle i18nBundle = loadI18nBundle();
        ResourceBundle resourceBundle = i18nBundle.getResourceBundle();

        Parent root = FXMLLoader.load(WindowUrlProvider.getMainWindow(), resourceBundle);
        primaryStage.setTitle(i18nBundle.getValue("appTitle"));
        primaryStage.setScene(new Scene(root, WindowProps.WIDTH, WindowProps.HEIGHT));
		primaryStage.show();

        AnchorPane personOverview = FXMLLoader.load(WindowUrlProvider.getPersonOverview(), resourceBundle);
        ((BorderPane) root).setCenter(personOverview);
    }

    private I18nBundle loadI18nBundle() {
        I18nBundle i18nBundle = I18nBundle.getInstance();
        i18nBundle.changeLocale(Locales.POLISH);
        return i18nBundle;
    }
}
