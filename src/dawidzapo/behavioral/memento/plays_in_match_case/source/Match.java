package dawidzapo.behavioral.memento.plays_in_match_case.source;

import dawidzapo.behavioral.memento.plays_in_match_case.snapshot.Snapshot;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.Play;
import dawidzapo.behavioral.memento.plays_in_match_case.source.team.Team;

import java.util.ArrayList;
import java.util.List;

public class Match {
    private Long id;
    private Team home;
    private Team away;
    private List<Play> plays;

    public Match(Long id, Team home, Team away) {
        this.id = id;
        this.home = home;
        this.away = away;
        this.plays = new ArrayList<>();
    }

    public Snapshot createSnapshot(){
        return new Snapshot(this, this.plays);
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public List<Play> getPlays() {
        return plays;
    }

    public void setPlays(List<Play> plays) {
        this.plays = plays;
    }
    public void addPlay(Play play){
        plays.add(play);
    }
}
