package dawidzapo.behavioral.strategy;

import dawidzapo.behavioral.strategy.player_with_strategy.Player;
import dawidzapo.behavioral.strategy.strategies.TFlatServe;
import dawidzapo.behavioral.strategy.strategies.TKickServe;
import dawidzapo.behavioral.strategy.strategies.WideFlatServe;
import dawidzapo.behavioral.strategy.strategies.WideSliceServe;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player(new WideFlatServe());
        player.serve();

        player.setStrategy(new TKickServe());
        player.serve();

        player.setStrategy(new TFlatServe());
        player.serve();

        player.setStrategy(new WideSliceServe());
        player.serve();
    }
}
