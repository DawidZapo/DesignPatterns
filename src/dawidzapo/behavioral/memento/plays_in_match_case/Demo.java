package dawidzapo.behavioral.memento.plays_in_match_case;

import dawidzapo.behavioral.memento.plays_in_match_case.source.Match;
import dawidzapo.behavioral.memento.plays_in_match_case.source.team.Team;

public class Demo {
    public static void main(String[] args) {
        Team ktk = new Team(1L, "KTK Knurow");
        Team gtk = new Team(2L, "GTK Gliwice");
        Match match = new Match(1L, ktk, gtk);
    }
}
