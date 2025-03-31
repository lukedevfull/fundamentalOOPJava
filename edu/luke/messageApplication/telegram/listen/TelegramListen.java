package edu.luke.messageApplication.telegram.listen;
import edu.luke.messageApplication.telegram.model.TelegramModel;

public class TelegramListen {
    public static void main(String[] args) {
        TelegramModel chatModel = new TelegramModel();
        chatModel.sendMessage("Hello on Telegram");
        chatModel.receiveMessage("Hi on Telegram", "John");
    }
}
