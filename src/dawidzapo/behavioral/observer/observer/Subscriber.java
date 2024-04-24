package dawidzapo.behavioral.observer.observer;

import dawidzapo.behavioral.observer.subject.Match;

public class Subscriber implements Observer{
    @Override
    public void update(Match match) {
        System.out.println(match);
    }
}
