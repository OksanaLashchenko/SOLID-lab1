package service;

import entity.Task;
import entity.User;

public interface UserService {

    void addTaskToUser(User user, Task task);

    void getMessage(User user);

}
