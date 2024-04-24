package dawidzapo.behavioral.observer.subject;

import java.util.ArrayList;
import java.util.List;

public class LiveScore {
    private List<Match> matches;

    public LiveScore() {
        matches = new ArrayList<>();
    }
    public void addMatch(Match match){
        matches.add(match);
    }
    public void removeMatch(Match match){
        matches.remove(match);
    }
}
