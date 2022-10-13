package service.impl;

import entity.Project;
import entity.User;
import service.MessageService;
import service.ProjectService;

import java.util.List;

public class DefaultProjectService implements ProjectService {

    @Override
    public void addUser(Project project, User user) {
        List<User> users = project.getUsers();
        users.add(user);
    }

    @Override
    public String getMessage(MessageService messageService) {
        return messageService.getMessage();
    }

}
