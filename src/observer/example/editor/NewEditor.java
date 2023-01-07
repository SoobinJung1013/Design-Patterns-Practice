package observer.example.editor;

import observer.example.publisher.NewEventManager;

public class NewEditor {

    public NewEventManager events;

    public NewEditor() {
        this.events = new NewEventManager("food", "movie");
    }

    public void foodNews() {

        events.notify("food");
    }

    public void movieNews() throws Exception {
            events.notify("movie");

    }
}
