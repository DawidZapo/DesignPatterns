package dawidzapo.creational.abstract_factory.sports_case.factories;

import dawidzapo.creational.abstract_factory.sports_case.apparel.racket.Racket;
import dawidzapo.creational.abstract_factory.sports_case.apparel.racket.WilsonRacket;
import dawidzapo.creational.abstract_factory.sports_case.apparel.shoes.Shoes;
import dawidzapo.creational.abstract_factory.sports_case.apparel.shoes.WilsonShoes;
import dawidzapo.creational.abstract_factory.sports_case.apparel.uniform.Uniform;
import dawidzapo.creational.abstract_factory.sports_case.apparel.uniform.WilsonUniform;

public class WilsonApparelFactory implements ApparelFactory{
    @Override
    public Racket createRacket() {
        return new WilsonRacket();
    }

    @Override
    public Shoes createShoes() {
        return new WilsonShoes();
    }

    @Override
    public Uniform createUniform() {
        return new WilsonUniform();
    }
}
