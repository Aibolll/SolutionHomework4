package com.myapp.config;

import java.util.Map;
import java.util.HashMap;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> config;

    // Private constructor to prevent instantiation
    private ConfigurationManager() {
        config = new HashMap<>();
        config.put("maxPlayers", "100");
        config.put("defaultLanguage", "en");
        config.put("gameDifficulty", "medium");
    }

    // Lazy initialization for Singleton instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Retrieve a config value by key
    public String getConfig(String key) {
        return config.getOrDefault(key, "Key not found");
    }

    // Print all configuration settings
    public void printConfigurations() {
        config.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
