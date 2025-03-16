package com.myapp.config;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        System.out.printf("Max Players: %s%n", configManager.getConfig("maxPlayers"));
        System.out.printf("Default Language: %s%n", configManager.getConfig("defaultLanguage"));
        System.out.printf("Game Difficulty: %s%n", configManager.getConfig("gameDifficulty"));

        System.out.println("\nPrinting all configurations:");
        configManager.printConfigurations();
    }
}
