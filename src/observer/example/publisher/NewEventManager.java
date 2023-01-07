package observer.example.publisher;


import observer.example.listeners.NewEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewEventManager {

    Map<String, List<NewEventListener>> listeners = new HashMap<>();

    public NewEventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, NewEventListener listener) {
        List<NewEventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, NewEventListener listener) {
        List<NewEventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType) {
        List<NewEventListener> users = listeners.get(eventType);
        for (NewEventListener listener : users) {
            listener.update(eventType);
        }
    }
}
