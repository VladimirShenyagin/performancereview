package patterns.behavioral.observer.listeners;

import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Сохранено в лог " + log + ": Выполнена операция " + eventType + " со следующим файлом: " + file.getName());
    }
}
