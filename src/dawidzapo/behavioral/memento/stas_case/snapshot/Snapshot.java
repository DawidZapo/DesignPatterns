package dawidzapo.behavioral.memento.stas_case.snapshot;

import dawidzapo.behavioral.memento.stas_case.source.Stats;

import java.time.LocalDateTime;

public class Snapshot {
    private Stats stats;
    private int allSets;
    private int allGames;
    private int allPoints;
    private double duration;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Snapshot(Stats stats, int allSets, int allGames, int allPoints, double duration, LocalDateTime startTime, LocalDateTime endTime) {
        this.stats = stats;
        this.allSets = allSets;
        this.allGames = allGames;
        this.allPoints = allPoints;
        this.duration = duration;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void restore(){
        stats.setAllSets(allSets);
        stats.setAllGames(allGames);
        stats.setAllPoints(allPoints);
        stats.setDuration(duration);
        stats.setStartTime(startTime);
        stats.setEndTime(endTime);
    }
}
