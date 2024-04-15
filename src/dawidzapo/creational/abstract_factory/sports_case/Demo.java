package dawidzapo.creational.abstract_factory.sports_case;

import dawidzapo.creational.abstract_factory.sports_case.factories.ApparelFactory;
import dawidzapo.creational.abstract_factory.sports_case.factories.HeadApparelFactory;
import dawidzapo.creational.abstract_factory.sports_case.factories.WilsonApparelFactory;
import dawidzapo.creational.abstract_factory.sports_case.player.Player;

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
