package dawidzapo.behavioral.observer.basic_case.subject;

import dawidzapo.behavioral.observer.basic_case.observer.Observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers();
}
