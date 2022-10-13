package service.impl;

import entity.Task;
import service.TaskService;

public class DefaultTaskService implements TaskService {

    @Override
    public void log(Task task) {
        System.out.println("Logging changes in task by:  " + task.getUser() + "at: " + task.getTime());
    }

}
