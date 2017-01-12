package pl.marapp.properties;

import java.util.HashMap;
import java.util.Map;
import java.util.prefs.Preferences;

public class UserPreferences {

    public static final String LOCALE_STR = "locale";

    public static final String WIDTH = "res_width";

    public static final String HEIGHT = "res_height";

    private static UserPreferences instance;

    private Map<String, String> prefMap;

    private UserPreferences() {
        Preferences preferences = Preferences.userNodeForPackage(UserPreferences.class);
        prefMap = new HashMap<>();
        prefMap.put(LOCALE_STR, preferences.get(LOCALE_STR, "ENGLISH"));
        prefMap.put(LOCALE_STR, preferences.get(WIDTH, "1024"));
        prefMap.put(LOCALE_STR, preferences.get(HEIGHT, "768"));
    }

    public String getProp(String key) {
        return prefMap.get(key);
    }

    public static UserPreferences getInstance() {
        if(instance == null) {
            instance = new UserPreferences();
        }
        return instance;
    }
}
