package edu.luke.messageApplication.msnTester;

import edu.luke.messageApplication.msnmodel.MsnModel;

public class MsnListen {
    public static void main(String[] args) {
        MsnModel chatModel = new MsnModel();
        chatModel.sendMessage("Hello");
        chatModel.receiveMessage("Hello!!", "John");
    }
}
