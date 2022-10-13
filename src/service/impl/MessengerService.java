package service.impl;

import service.MessageService;

public class MessengerService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via Messenger" + message);
    }

    @Override
    public String getMessage() {
        String message = "Getting message via Messenger";
        System.out.println(message);
        return message;
    }

}
