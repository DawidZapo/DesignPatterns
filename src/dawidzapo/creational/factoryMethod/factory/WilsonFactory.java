package dawidzapo.creational.factoryMethod.factory;

import dawidzapo.creational.factoryMethod.buttons.Racket;
import dawidzapo.creational.factoryMethod.buttons.WilsonRacket;

public class WilsonFactory extends Factory{

    @Override
    public Racket createRacket() {
        return new WilsonRacket();
    }
}
