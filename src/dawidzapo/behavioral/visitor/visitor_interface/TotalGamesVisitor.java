package dawidzapo.behavioral.visitor.visitor_interface;

import dawidzapo.behavioral.visitor.element.Player;

public class TotalGamesVisitor implements Visitor{
    int totalGames = 0;

    @Override
    public void visit(Player player) {
        totalGames += player.getGames();
    }

    public int getTotalGames() {
        return totalGames;
    }
}
