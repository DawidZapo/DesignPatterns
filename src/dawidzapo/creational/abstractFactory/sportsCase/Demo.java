package dawidzapo.creational.abstractFactory.sportsCase;

import dawidzapo.creational.abstractFactory.sportsCase.factories.ApparelFactory;
import dawidzapo.creational.abstractFactory.sportsCase.factories.HeadApparelFactory;
import dawidzapo.creational.abstractFactory.sportsCase.factories.WilsonApparelFactory;
import dawidzapo.creational.abstractFactory.sportsCase.player.Player;

public class Demo {
    public static void main(String[] args) {
        ApparelFactory apparelFactory = new HeadApparelFactory();
        Player headPlayer = new Player(apparelFactory);
        headPlayer.describe();

        apparelFactory = new WilsonApparelFactory();
        Player wilsonPlayer = new Player(apparelFactory);
        wilsonPlayer.describe();
    }
}
