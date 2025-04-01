package edu.luke.messageApplication.messageApplicationModel;

public abstract class MessageModel {
    
    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message, String sender);

    public void checkConnection() {
        System.out.println("Checking connection...");
    }

    public void saveHistory(String message) {
        System.out.println("Saving history: " + message);
    }
}
