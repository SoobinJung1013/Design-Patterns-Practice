package observer.example.editor;

import observer.example.publisher.EventManager;

import java.io.File;

public class Editor {

    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save", "delete");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }

    public void deleteFile() throws Exception {
        if (this.file != null) {
            events.notify("delete", file);
        } else {
            throw new Exception("Please open a file first.");
        }

    }
}
