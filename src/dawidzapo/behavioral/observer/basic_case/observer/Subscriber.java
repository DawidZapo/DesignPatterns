package dawidzapo.behavioral.observer.basic_case.observer;

import dawidzapo.behavioral.observer.basic_case.subject.Match;

public class Subscriber implements Observer{
    @Override
    public void update(Match match) {
        System.out.println(match);
    }
}
