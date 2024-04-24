package dawidzapo.behavioral.observer.subject;

import dawidzapo.behavioral.observer.observer.Observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers();
}
