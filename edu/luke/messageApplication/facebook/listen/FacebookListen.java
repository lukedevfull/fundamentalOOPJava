package edu.luke.messageApplication.facebook.listen;
import edu.luke.messageApplication.facebook.model.FacebookModel;

public class FacebookListen {
    public static void main(String[] args) {
        FacebookModel chatModel = new FacebookModel();
        chatModel.sendMessage("Hello on Facebook");
        chatModel.receiveMessage("Hi on Facebook", "John");
    }
}
