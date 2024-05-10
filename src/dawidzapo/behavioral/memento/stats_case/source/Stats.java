package dawidzapo.behavioral.memento.stats_case.source;

import dawidzapo.behavioral.memento.stats_case.snapshot.Snapshot;

import java.time.LocalDateTime;

public class Stats {
    private int allSets;
    private int allGames;
    private int allPoints;
    private double duration;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Stats(int allSets, int allGames, int allPoints, double duration, LocalDateTime startTime, LocalDateTime endTime) {
        this.allSets = allSets;
        this.allGames = allGames;
        this.allPoints = allPoints;
        this.duration = duration;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setAllSets(int allSets) {
        this.allSets = allSets;
    }

    public void setAllGames(int allGames) {
        this.allGames = allGames;
    }

    public void setAllPoints(int allPoints) {
        this.allPoints = allPoints;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Snapshot createSnapshot(){
        return new Snapshot(this,allSets,allGames,allPoints,duration,startTime,endTime);
    }

    @Override
    public String toString() {
        return "Stats{" +
                "allSets=" + allSets +
                ", allGames=" + allGames +
                ", allPoints=" + allPoints +
                ", duration=" + duration +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
