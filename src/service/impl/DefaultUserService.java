package service.impl;

import entity.Task;
import entity.User;
import service.MessageService;
import service.UserService;

import java.util.List;

public class DefaultUserService implements UserService {

    private MessageService messageService;

    @Override
    public void addTaskToUser(User user, Task task) {
        task.setUser(user);
    }

    @Override
    public void getMessage(User user) {
        String message = messageService.getMessage();
        List<String> messages = user.getMessages();
        messages.add(message);
    }

}
