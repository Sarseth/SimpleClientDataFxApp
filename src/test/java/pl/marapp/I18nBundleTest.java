package pl.marapp;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Locale;

import org.junit.Test;

public class I18nBundleTest {

    @Test
    public void checkIfEnAppNameCorrect() {
        // GIVEN
        I18nBundle i18nBundle = I18nBundle.getInstance();
        i18nBundle.changeLocale(Locale.ENGLISH);

        // WHEN
        String appTitle = i18nBundle.getValue("appTitle");

        // THEN
        assertThat(appTitle, is("Client base"));
    }

}
