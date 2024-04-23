package dawidzapo.behavioral.iterator.iterator;

import dawidzapo.behavioral.iterator.player.Player;

public interface PlayerIterator {
    boolean hasNext();
    Player next();
    void reset();
}
