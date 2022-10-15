package service.impl;

import entity.Task;
import service.LogSevice;
import service.TaskService;

public class DefaultTaskService implements TaskService {

    private LogSevice logSevice;

    @Override
    public void log(Task task) {
        logSevice.log(task);
    }

}
