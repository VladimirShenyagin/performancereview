package patterns.behavioral.observer;

import patterns.behavioral.observer.editor.Editor;
import patterns.behavioral.observer.listeners.EmailNotificationListener;
import patterns.behavioral.observer.listeners.LogOpenListener;

public class ObserverApplication {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.getEvents().subscribe("открыть", new LogOpenListener("file.txt"));
        editor.getEvents().subscribe("открыть", new EmailNotificationListener("admin@example.com"));
        editor.getEvents().subscribe("сохранить", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
