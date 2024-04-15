package dawidzapo.creational.abstract_factory.sports_case.factories;

import dawidzapo.creational.abstract_factory.sports_case.apparel.racket.Racket;
import dawidzapo.creational.abstract_factory.sports_case.apparel.shoes.Shoes;
import dawidzapo.creational.abstract_factory.sports_case.apparel.uniform.Uniform;

public interface ApparelFactory {
    Racket createRacket();
    Shoes createShoes();
    Uniform createUniform();
}
