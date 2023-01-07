package observer.example;

import observer.example.editor.Editor;
import observer.example.editor.NewEditor;
import observer.example.listeners.EmailNotificationListener;
import observer.example.listeners.LogOpenListener;
import observer.example.listeners.UserListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("delete", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
            editor.deleteFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        NewEditor newsEditor = new NewEditor();
        newsEditor.events.subscribe("food", new UserListener());
        newsEditor.events.subscribe("movie", new UserListener());

        try {
            newsEditor.movieNews();
            newsEditor.foodNews();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
