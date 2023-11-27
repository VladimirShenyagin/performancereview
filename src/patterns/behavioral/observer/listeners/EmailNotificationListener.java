package patterns.behavioral.observer.listeners;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Письмо для " + email + ": Выполнена операция " + eventType + " со следующим файлом: " + file.getName());
    }
}
