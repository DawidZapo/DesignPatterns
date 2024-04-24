package dawidzapo.behavioral.observer.complex_case.subject;

import dawidzapo.behavioral.observer.complex_case.helper_class.Club;
import dawidzapo.behavioral.observer.complex_case.observer.Observer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NbaGame implements Subject{
    private Club club1;
    private Club club2;
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;
    private Duration gameDuration;
    private String finalScore;
    private List<Observer> clutchTimeSubscribers = new ArrayList<>();
    private List<Observer> gameStartSubscribers = new ArrayList<>();
    private List<Observer> gameEndSubscribers = new ArrayList<>();
    private List<Observer> gameReminderSubscribers = new ArrayList<>();

    public NbaGame(Club club1, Club club2) {
        this.club1 = club1;
        this.club2 = club2;
        this.timeStart = LocalDateTime.now();
        this.gameDuration = Duration.ZERO;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public void setGameDuration(Duration gameDuration) {
        this.gameDuration = gameDuration;
    }

    public void setFinalScore(String finalScore) {
        this.finalScore = finalScore;
    }

    @Override
    public void subscribeToAll(Observer observer) {
        gameStartSubscribers.add(observer);
        gameEndSubscribers.add(observer);
        clutchTimeSubscribers.add(observer);
        gameReminderSubscribers.add(observer);
    }

    @Override
    public void subscribeToClutchTime(Observer observer) {
        clutchTimeSubscribers.add(observer);
    }

    @Override
    public void subscribeToGameStart(Observer observer) {
        gameStartSubscribers.add(observer);
    }

    @Override
    public void subscribeToGameEnd(Observer observer) {
        gameEndSubscribers.add(observer);
    }

    @Override
    public void subscribeToGameReminder(Observer observer) {
        gameReminderSubscribers.add(observer);
    }

    @Override
    public String toString() {
        return "NbaGame{" +
                "club1=" + club1 +
                ", club2=" + club2 +
                ", timeStart=" + timeStart +
                ", timeEnd=" + timeEnd +
                ", gameDuration=" + gameDuration +
                ", finalScore='" + finalScore + '\'' +
                ", clutchTimeSubscribers=" + clutchTimeSubscribers +
                ", gameStartSubscribers=" + gameStartSubscribers +
                ", gameEndSubscribers=" + gameEndSubscribers +
                ", gameReminderSubscribers=" + gameReminderSubscribers +
                '}';
    }
}
