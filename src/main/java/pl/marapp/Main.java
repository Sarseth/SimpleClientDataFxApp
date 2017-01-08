package pl.marapp;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
        Parent root = FXMLLoader.load(WindowUrlProvider.getMainWindow(), i18nBundle.getResourceBundle());
        primaryStage.setTitle(i18nBundle.getValue("appTitle"));
        primaryStage.setScene(new Scene(root, WindowProps.WIDTH, WindowProps.HEIGHT));
		primaryStage.show();

    }

    private I18nBundle loadI18nBundle() {
        I18nBundle i18nBundle = I18nBundle.getInstance();
        i18nBundle.changeLocale(Locales.POLISH);
        return i18nBundle;
    }
}
