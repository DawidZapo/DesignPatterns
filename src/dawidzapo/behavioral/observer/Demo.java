package dawidzapo.behavioral.observer;

import dawidzapo.behavioral.observer.observer.Observer;
import dawidzapo.behavioral.observer.observer.Subscriber;
import dawidzapo.behavioral.observer.subject.LiveScore;
import dawidzapo.behavioral.observer.subject.Match;

import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        LiveScore liveScore = new LiveScore();
        Match match1 = new Match(LocalDateTime.now(), "Liverpool","Chelsea");
        Match match2 = new Match(LocalDateTime.now(), "Real Madrid","Arsenal");
        Match match3 = new Match(LocalDateTime.now(), "BVB","Bayern");
        liveScore.addMatch(match1);
        liveScore.addMatch(match2);
        liveScore.addMatch(match3);

        Observer subscriber = new Subscriber();
        match1.subscribe(subscriber);
        match2.subscribe(subscriber);

        match1.setScore("0:1"); //subscribed -> notified
        match2.setScore("1:0"); //subscribed -> notified
        match3.setTimeEnd(LocalDateTime.now()); //unsubscribed -> no notification

    }
}
