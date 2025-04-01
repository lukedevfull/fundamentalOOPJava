package edu.luke.messageApplication.msn.listen;

import edu.luke.messageApplication.msn.msnmodel.Model;

public class MsnListen {
    public static void main(String[] args) {
        Model chatModel = new Model();
        chatModel.sendMessage("Hello");
        chatModel.receiveMessage("Hello!!", "John");
    }
}
