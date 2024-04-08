package dawidzapo.creational.factoryMethod.factory;

import dawidzapo.creational.factoryMethod.buttons.Racket;
import dawidzapo.creational.factoryMethod.buttons.YonexRacket;

public class YonexFactory extends Factory{

    @Override
    public Racket createRacket() {
        return new YonexRacket();
    }
}
