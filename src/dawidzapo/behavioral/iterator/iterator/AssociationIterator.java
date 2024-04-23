package dawidzapo.behavioral.iterator.iterator;

import dawidzapo.behavioral.iterator.associations.TennisAssociation;
import dawidzapo.behavioral.iterator.player.Player;

public class AssociationIterator implements PlayerIterator{
    private TennisAssociation tennisAssociation;
    private int currentPosition;

    public AssociationIterator(TennisAssociation tennisAssociation) {
        this.tennisAssociation = tennisAssociation;
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < tennisAssociation.getPlayers().size();
    }

    @Override
    public Player next() {
        if(!hasNext()){
            return null;
        }
        Player player = tennisAssociation.getPlayers().get(currentPosition);

        currentPosition++;
        return player;
    }

    @Override
    public void reset() {
        this.currentPosition = 0;
    }
}
