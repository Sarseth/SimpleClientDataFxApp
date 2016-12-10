package pl.marapp;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.marapp.properties.WindowProps;
import pl.marapp.properties.WindowUrlProvider;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(WindowUrlProvider.getMainWindow());
		primaryStage.setTitle(WindowProps.TITLE);
		primaryStage.setScene(new Scene(root, WindowProps.WIDTH, WindowProps.HEIGHT));
		primaryStage.show();
	}
}
