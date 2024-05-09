package dawidzapo.behavioral.memento.plays_in_match_case.source.team;

import dawidzapo.behavioral.memento.plays_in_match_case.source.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private Long id;
    private String name;
    private List<Player> players;
    private int timeouts;

    public Team(Long id, String name) {
        this.id = id;
        this.name = name;
        this.players = new ArrayList<>();
        this.timeouts = 0;
    }
}
