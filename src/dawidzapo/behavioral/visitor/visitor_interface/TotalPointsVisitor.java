package dawidzapo.behavioral.visitor.visitor_interface;

import dawidzapo.behavioral.visitor.element.Player;

public class TotalPointsVisitor implements Visitor{
    int totalPoints = 0;
    @Override
    public void visit(Player player) {
        totalPoints += player.getPoints();
    }

    public int getTotalPoints() {
        return totalPoints;
    }
}
