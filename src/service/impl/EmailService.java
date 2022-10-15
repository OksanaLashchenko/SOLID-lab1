package service.impl;

import service.MessageService;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending task via email " + message);
    }

    @Override
    public String getMessage() {
        String message = "Getting message via email";
        System.out.println(message);
        return message;
    }

}
