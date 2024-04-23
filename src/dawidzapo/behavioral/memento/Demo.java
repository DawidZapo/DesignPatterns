package dawidzapo.behavioral.memento;

import dawidzapo.behavioral.memento.snapshot.History;
import dawidzapo.behavioral.memento.source.Stats;

import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        Stats stats = new Stats(3,21,103,90, LocalDateTime.now(), LocalDateTime.now());
        History history = History.getInstance();

        history.addSnapshot(stats.createSnapshot());

        System.out.println(stats);
        stats.setAllSets(4);
        stats.setAllPoints(104);
        stats.setAllGames(22);
        System.out.println(stats);

        history.getLastestSnapshot().restore();
        System.out.println(stats);

    }
}
