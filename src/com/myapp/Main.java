package com.myapp;

import com.myapp.config.ConfigurationManager;
import com.myapp.chat.ChatService;
import com.myapp.chat.ChatServiceAdapter;
import com.myapp.chat.LegacyChatService;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern Demo
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("Max Players: " + configManager.getConfig("maxPlayers"));
        configManager.printConfigurations();

        // Adapter Pattern Demo
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChat);
        chatService.sendMessage("Hello world!");
    }
}

