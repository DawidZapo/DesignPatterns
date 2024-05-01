package dawidzapo.behavioral.visitor;

import dawidzapo.behavioral.visitor.element.Player;
import dawidzapo.behavioral.visitor.visitor_interface.TotalGamesVisitor;
import dawidzapo.behavioral.visitor.visitor_interface.TotalPointsVisitor;
import dawidzapo.behavioral.visitor.visitor_interface.TotalSetsVisitor;

public class Demo {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setPoints(104);
        player1.setGames(8);
        player1.setSets(0);

        Player player2 = new Player();
        player2.setPoints(140);
        player2.setGames(12);
        player2.setSets(2);

        TotalGamesVisitor totalGamesVisitor = new TotalGamesVisitor();
        TotalPointsVisitor totalPointsVisitor = new TotalPointsVisitor();
        TotalSetsVisitor totalSetsVisitor = new TotalSetsVisitor();

        player1.accept(totalPointsVisitor);
        player2.accept(totalPointsVisitor);
        System.out.println("Total points: " + totalPointsVisitor.getTotalPoints());

        player1.accept(totalSetsVisitor);
        player2.accept(totalSetsVisitor);
        System.out.println("Total points: " + totalSetsVisitor.getTotalSets());
    }
}
