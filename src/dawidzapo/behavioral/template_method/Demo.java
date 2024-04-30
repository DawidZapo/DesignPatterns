package dawidzapo.behavioral.template_method;

import dawidzapo.behavioral.template_method.game.Game;
import dawidzapo.behavioral.template_method.game.NoTieBreakGame;
import dawidzapo.behavioral.template_method.game.SuperTieBreakGame;
import dawidzapo.behavioral.template_method.game.TieBreakGame;
import dawidzapo.behavioral.template_method.player.Player;

public class Demo {
    public static void main(String[] args) {
        Player player1 = new Player("Nick Kyrgios");
        Player player2 = new Player("Hubert Hurkacz");
        Game superTieBreakGame = new SuperTieBreakGame(player1,player2);
        superTieBreakGame.playGame();

        Game tieBreakGame = new TieBreakGame(player1, player2);
        tieBreakGame.playGame();

        Game noTieBreakGame = new NoTieBreakGame(player1, player2);
        noTieBreakGame.playGame();
    }
}
