package dawidzapo.behavioral.observer.complex_case.subject;

import dawidzapo.behavioral.observer.complex_case.observer.Observer;

public interface Subject {
    void subscribeToAll(Observer observer);
    void subscribeToClutchTime(Observer observer);
    void subscribeToGameStart(Observer observer);
    void subscribeToGameEnd(Observer observer);
    void subscribeToGameReminder(Observer observer);
}
