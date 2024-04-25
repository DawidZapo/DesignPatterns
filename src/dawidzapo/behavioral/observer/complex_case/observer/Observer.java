package dawidzapo.behavioral.observer.complex_case.observer;

import dawidzapo.behavioral.observer.complex_case.subject.Game;

public interface Observer {
    void getNotification(String message, Game game);
}
