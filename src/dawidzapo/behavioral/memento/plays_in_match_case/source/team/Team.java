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

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setTimeouts(int timeouts) {
        this.timeouts = timeouts;
    }
}
