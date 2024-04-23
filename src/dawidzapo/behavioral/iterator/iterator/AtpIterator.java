package dawidzapo.behavioral.iterator.iterator;

import dawidzapo.behavioral.iterator.associations.Atp;
import dawidzapo.behavioral.iterator.player.Player;

public class AtpIterator implements PlayerIterator{
    private Atp atp;
    private int currentPosition;

    public AtpIterator(Atp atp) {
        this.atp = atp;
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < atp.getPlayers().size();
    }

    @Override
    public Player next() {
        if(!hasNext()){
            return null;
        }
        Player player = atp.getPlayers().get(currentPosition);

        currentPosition++;
        return player;
    }

    @Override
    public void reset() {
        this.currentPosition = 0;
    }
}
