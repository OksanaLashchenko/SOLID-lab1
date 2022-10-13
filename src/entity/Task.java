package entity;

import java.time.LocalDateTime;

public class Task {

    private User user;
    private final String message;
    private final LocalDateTime time;

    public void setUser(User user) {
        this.user = user;
    }

    public Task(User user, String message, LocalDateTime time) {
        this.user = user;
        this.message = message;
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTime() {
        return time;
    }

}
