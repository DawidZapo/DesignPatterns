package dawidzapo.behavioral.visitor.visitor_interface;

import dawidzapo.behavioral.visitor.element.Player;

public class TotalSetsVisitor implements Visitor{
    int totalSets = 0;

    @Override
    public void visit(Player player) {
        totalSets += player.getSets();
    }

    public int getTotalSets() {
        return totalSets;
    }
}
