package dawidzapo.creational.abstract_factory.sports_case.factories;

import dawidzapo.creational.abstract_factory.sports_case.apparel.racket.HeadRacket;
import dawidzapo.creational.abstract_factory.sports_case.apparel.racket.Racket;
import dawidzapo.creational.abstract_factory.sports_case.apparel.shoes.HeadShoes;
import dawidzapo.creational.abstract_factory.sports_case.apparel.shoes.Shoes;
import dawidzapo.creational.abstract_factory.sports_case.apparel.uniform.HeadUniform;
import dawidzapo.creational.abstract_factory.sports_case.apparel.uniform.Uniform;

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
