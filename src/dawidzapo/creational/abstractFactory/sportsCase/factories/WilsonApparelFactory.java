package dawidzapo.creational.abstractFactory.sportsCase.factories;

import dawidzapo.creational.abstractFactory.sportsCase.apparel.racket.Racket;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.racket.WilsonRacket;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.shoes.Shoes;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.shoes.WilsonShoes;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.uniform.Uniform;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.uniform.WilsonUniform;

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
