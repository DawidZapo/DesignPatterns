package dawidzapo.creational.abstract_factory.sports_case.player;

import dawidzapo.creational.abstract_factory.sports_case.apparel.racket.Racket;
import dawidzapo.creational.abstract_factory.sports_case.apparel.shoes.Shoes;
import dawidzapo.creational.abstract_factory.sports_case.apparel.uniform.Uniform;
import dawidzapo.creational.abstract_factory.sports_case.factories.ApparelFactory;

public class Player {
    private Racket racket;
    private Shoes shoes;
    private Uniform uniform;

    public Player(ApparelFactory apparelFactory){
        racket = apparelFactory.createRacket();
        shoes = apparelFactory.createShoes();
        uniform = apparelFactory.createUniform();
    }

    public void describe(){
        racket.smash();
        shoes.run();
        uniform.lookGood();
    }
}
