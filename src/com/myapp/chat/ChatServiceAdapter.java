package com.myapp.chat;

public class ChatServiceAdapter implements ChatService {
    private final LegacyChatService legacyChatService;

    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    @Override
    public void sendMessage(String message) {
        legacyChatService.sendOldMessageFormat(message);
    }
}
