package service.impl;

import entity.Task;
import service.LogSevice;

public class DefaultLogService implements LogSevice {

    @Override
    public void log(Task task) {
        System.out.println("Logging changes in task by:  " + task.getUser() + "at: " + task.getTime());
    }
}
