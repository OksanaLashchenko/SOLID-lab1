package service.impl;

import service.MessageService;

public class SmsService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending task via sms " + message);
    }

    @Override
    public String getMessage() {
        String message = "Getting message via sms";
        System.out.println(message);
        return message;
    }

}
