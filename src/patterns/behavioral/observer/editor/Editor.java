package patterns.behavioral.observer.editor;

import patterns.behavioral.observer.publisher.EventManager;

import java.io.File;

public class Editor {
    private EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("открыть", "сохранить");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("открыть", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("сохранить", file);
        } else {
            throw new Exception("Сначала откройте файл");
        }
    }

    public EventManager getEvents() {
        return events;
    }
}
