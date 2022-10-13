package service;

import entity.Project;
import entity.User;

public interface ProjectService {

    void addUser(Project project, User user);

    String getMessage(MessageService messageService);

}
