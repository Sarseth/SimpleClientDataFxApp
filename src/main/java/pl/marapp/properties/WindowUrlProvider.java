package pl.marapp.properties;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class WindowUrlProvider {

    private static final String VIEW_DICT = System.getProperty("user.dir") + "\\src\\main\\resources\\view\\";

    public static URL getMainWindow() throws MalformedURLException {
        return getUrlByName("MainView");
    }

    public static URL getPersonOverview() throws MalformedURLException {
        return getUrlByName("PersonOverview");
    }

    private static URL getUrlByName(String name) throws MalformedURLException {
        return new File(VIEW_DICT + name + ".fxml").toURL();
    }

}
