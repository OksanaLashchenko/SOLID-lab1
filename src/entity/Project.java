package entity;

import java.util.List;

public class Project {

    private List<User> users;
    private List<Task> tasks;

    public List<Task> getTasks() {
        return tasks;
    }

    public List<User> getUsers() {
        return users;
    }

}
