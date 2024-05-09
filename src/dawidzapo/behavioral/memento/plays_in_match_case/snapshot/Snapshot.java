package dawidzapo.behavioral.memento.plays_in_match_case.snapshot;

import dawidzapo.behavioral.memento.plays_in_match_case.source.Match;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.Play;

import java.util.List;

public class Snapshot {
    private Match match;
    private List<Play> plays;

    public Snapshot(Match match, List<Play> plays) {
        this.match = match;
        this.plays = plays;
    }
    public void restore(){
        match.setPlays(plays);
    }
}
