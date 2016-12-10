package pl.marapp.properties;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class WindowUrlProvider {

	public static URL getMainWindow() throws MalformedURLException {
		return new File(System.getProperty("user.dir") + "\\src\\main\\resources\\sample.fxml").toURL();
	}

}
