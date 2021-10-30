package com.staxrt.tutorial.model;

/**
 * The type Telegram Msg.
 *
 * @author Khanh Pham
 */
public class TelegramMsg {
    private String botMessage;
    private String chatID;
    
    // Constructor, getters and setters

    /**
     * Gets message.
     *
     * @return the first name
     */
    public String getBotMessage() {
        return botMessage;
    }

    /**
     * Gets chat id.
     *
     * @return the first name
     */
    public String getChatID() {
        return chatID;
    }
}
