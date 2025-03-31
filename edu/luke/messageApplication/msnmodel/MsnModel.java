package edu.luke.messageApplication.msnmodel;

public class MsnModel {
    public void sendMessage(String message){
        System.out.println("-----------------------------");
        checkConnection();
        System.out.println("Message sent: " + message);
        saveHistory(message);
    }

    public void receiveMessage(String message, String sender){
        System.out.println("-----------------------------");
        checkConnection();
        System.out.println("Message received: " + message + " from " + sender);
        saveHistory(message);
    }

    private void checkConnection(){
        System.out.println("Checking connection");
    }

    private void saveHistory(String message){
        System.out.println("Saving history: " + message);
    }
}
