package pl.marapp.properties;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class WindowUrlProvider {

    private static final String VIEW_DICT = System.getProperty("user.dir") + "\\src\\main\\resources\\view\\";

	public static URL getMainWindow() throws MalformedURLException {
        return new File(VIEW_DICT + "MainView.fxml").toURL();
    }

}
