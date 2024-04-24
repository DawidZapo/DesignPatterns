package dawidzapo.behavioral.observer.subject;

import dawidzapo.behavioral.observer.observer.Observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Match implements Subject{
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;
    private boolean finished;
    private String team1;
    private String team2;
    private String score;
    private List<Observer> subscribers;
    public Match(LocalDateTime timeStart, String team1, String team2) {
        this.timeStart = timeStart;
        this.finished = false;
        this.team1 = team1;
        this.team2 = team2;
        this.subscribers = new ArrayList<>();
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
        notifySubscribers();
    }

    public void setScore(String score) {
        this.score = score;
        notifySubscribers();
    }

    @Override
    public String toString() {
        return "Match{" +
                "timeStart=" + timeStart +
                ", timeEnd=" + timeEnd +
                ", finished=" + finished +
                ", team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(var subscriber : subscribers){
            subscriber.update(this);
        }
    }
}
