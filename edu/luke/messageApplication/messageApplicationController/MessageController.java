package edu.luke.messageApplication.messageApplicationController;

import edu.luke.messageApplication.messageApplicationModel.MessageModel;

public class MessageController extends MessageModel {
    @Override
    public void sendMessage(String message) {
        System.out.println("-----------------------------");
        checkConnection();
        System.out.println("Message sent: " + message);
        saveHistory(message);
    }

    @Override
    public void receiveMessage(String message, String sender) {
        System.out.println("-----------------------------");
        checkConnection();
        System.out.println("Message received: " + message + " from " + sender);
        saveHistory(message);
    }
}
