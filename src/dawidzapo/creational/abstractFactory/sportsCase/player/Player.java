package dawidzapo.creational.abstractFactory.sportsCase.player;

import dawidzapo.creational.abstractFactory.sportsCase.apparel.racket.Racket;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.shoes.Shoes;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.uniform.Uniform;
import dawidzapo.creational.abstractFactory.sportsCase.factories.ApparelFactory;

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
