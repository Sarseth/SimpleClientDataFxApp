package pl.marapp;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

public class I18nBundle {

    private static I18nBundle instance;

    private ResourceBundle resourceBundle;

    private Locale currentLocale;

    private I18nBundle() {
        if(instance == null) {
            //TODO: Save last used locales to file
            currentLocale = readLocalesFromConfigFile();
            reloadBundle();
            instance = this;
        } else {
            throw new RuntimeException("Double initialization of I18nBundle");
        }
    }

    public String getValue(String label) {
        return resourceBundle.getString(label);
    }

    public void changeLocale(Locale newLocale) {
        if(!Objects.equals(currentLocale, newLocale)) {
            currentLocale = newLocale;
            reloadBundle();
            // TODO: Save last used locales to file
        }
    }

    private void reloadBundle() {
        ResourceBundle.Control control = new ResourceBundleControl();
        resourceBundle = ResourceBundle.getBundle("locales.MyBundle", currentLocale, control);
    }

    private Locale readLocalesFromConfigFile() {
        // try in file
        return Locale.getDefault();
    }

    public static I18nBundle getInstance() {
        if(instance == null) {
            new I18nBundle();
        }
        return instance;
    }

    private static class ResourceBundleControl extends ResourceBundle.Control {
        @Override
        public List<Locale> getCandidateLocales(String baseName, Locale locale) {
            if(Objects.equals(locale, Locale.ENGLISH)) {
                return Collections.singletonList(Locale.ROOT);
            } else {
                return Collections.singletonList(locale);
            }
        }
    }
}
