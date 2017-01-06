package pl.marapp;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import pl.marapp.properties.Locales;

public class I18nBundleTest {

    @Test
    public void checkIfEnAppNameCorrect() {
        // GIVEN
        I18nBundle i18nBundle = I18nBundle.getInstance();
        i18nBundle.changeLocale(Locales.ENGLISH);

        // WHEN
        String appTitle = i18nBundle.getValue("appTitle");

        // THEN
        assertThat(appTitle, is("Client base"));
    }

    @Test
    public void checkIfEnAppNameCorrectPolish() {
        // GIVEN
        I18nBundle i18nBundle = I18nBundle.getInstance();
        i18nBundle.changeLocale(Locales.POLISH);

        // WHEN
        String appTitle = i18nBundle.getValue("appTitle");

        // THEN
        assertThat(appTitle, is("Baza klientów"));
    }

}
