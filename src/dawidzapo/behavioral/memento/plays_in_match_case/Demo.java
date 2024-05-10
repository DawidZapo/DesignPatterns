package dawidzapo.behavioral.memento.plays_in_match_case;

import dawidzapo.behavioral.memento.plays_in_match_case.builder.shot.ShotBuilder;
import dawidzapo.behavioral.memento.plays_in_match_case.builder.shot.ShotDirector;
import dawidzapo.behavioral.memento.plays_in_match_case.snapshot.Snapshot;
import dawidzapo.behavioral.memento.plays_in_match_case.source.Match;
import dawidzapo.behavioral.memento.plays_in_match_case.source.team.Team;

public class Demo {
    public static void main(String[] args) {
        Team ktk = new Team(1L, "KTK Knurow");
        Team gtk = new Team(2L, "GTK Gliwice");
        Match match = new Match(1L, ktk, gtk);

        ShotBuilder shotBuilder = new ShotBuilder();
        ShotDirector shotDirector = new ShotDirector();

        shotDirector.buildMadeHardContestedLeftWingTwo(1L,1L,shotBuilder);
        match.addPlay(shotBuilder.getResult());

        shotDirector.buildMissedContestedTopOfTheKeyThree(1L, 1L, shotBuilder);
        match.addPlay(shotBuilder.getResult());

        shotDirector.buildMadeWideOpenRightCornerThree(1L,1L, shotBuilder);
        match.addPlay(shotBuilder.getResult());

        Snapshot snapshot = match.createSnapshot();

        shotDirector.buildMadeHardContestedLeftWingTwo(1L, 1L, shotBuilder);
        match.addPlay(shotBuilder.getResult());

        System.out.println(match.getPlays().size());
        snapshot.restore();
        System.out.println(match.getPlays().size());


    }
}
