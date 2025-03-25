package Observer;

import java.util.ArrayList;

public class EventManager {
    private ArrayList<EventListeners> observers;
    public EventManager() {
        observers = new ArrayList<EventListeners>();
    }

    public void subscribe(EventListeners observer) {
        observers.add(observer);
    }

    public void unsubscribe(EventListeners observer) {
        observers.remove(observer);
    }

    public void notifyObservers(double event) {
        for (EventListeners observer : observers) {
            observer.update(event);
        }
    }
}
