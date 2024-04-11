package dawidzapo.creational.factoryMethod.factory;

import dawidzapo.creational.factoryMethod.rackets.Racket;
import dawidzapo.creational.factoryMethod.rackets.WilsonRacket;

public class WilsonFactory extends Factory{

    @Override
    public Racket createRacket() {
        return new WilsonRacket();
    }
}
