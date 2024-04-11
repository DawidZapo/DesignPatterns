package dawidzapo.creational.factoryMethod.factory;

import dawidzapo.creational.factoryMethod.rackets.Racket;
import dawidzapo.creational.factoryMethod.rackets.YonexRacket;

public class YonexFactory extends Factory{

    @Override
    public Racket createRacket() {
        return new YonexRacket();
    }
}
