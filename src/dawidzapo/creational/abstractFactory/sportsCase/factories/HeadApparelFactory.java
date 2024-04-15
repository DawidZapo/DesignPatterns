package dawidzapo.creational.abstractFactory.sportsCase.factories;

import dawidzapo.creational.abstractFactory.sportsCase.apparel.racket.HeadRacket;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.racket.Racket;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.shoes.HeadShoes;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.shoes.Shoes;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.uniform.HeadUniform;
import dawidzapo.creational.abstractFactory.sportsCase.apparel.uniform.Uniform;

public class HeadApparelFactory implements ApparelFactory{
    @Override
    public Racket createRacket() {
        return new HeadRacket();
    }

    @Override
    public Shoes createShoes() {
        return new HeadShoes();
    }

    @Override
    public Uniform createUniform() {
        return new HeadUniform();
    }
}
