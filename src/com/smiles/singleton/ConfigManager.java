package com.smiles.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private Map<String, Object> settings = new HashMap<String, Object>();
    private static ConfigManager instance = new ConfigManager();

    private ConfigManager(){}

    public static ConfigManager getInstance() {
        return instance;
    }

    public Object getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, Object value) {
        settings.put(key, value);
    }
}
