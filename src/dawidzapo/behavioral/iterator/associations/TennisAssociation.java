package dawidzapo.behavioral.iterator.associations;

import dawidzapo.behavioral.iterator.player.Player;

import java.util.List;

public abstract class TennisAssociation {
    public abstract void populatePlayers();
    public abstract List<Player> getPlayers();
}
