package dawidzapo.creational.abstractFactory.sportsCase.factories;

import dawidzapo.creational.abstractFactory.sportsCase.apparel.racket.Racket;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.shoes.Shoes;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.uniform.Uniform;

public interface ApparelFactory {
    Racket createRacket();
    Shoes createShoes();
    Uniform createUniform();
}
