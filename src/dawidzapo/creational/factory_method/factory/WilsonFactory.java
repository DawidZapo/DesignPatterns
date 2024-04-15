package dawidzapo.creational.factory_method.factory;

import dawidzapo.creational.factory_method.rackets.Racket;
import dawidzapo.creational.factory_method.rackets.WilsonRacket;

public class WilsonFactory extends Factory{

    @Override
    public Racket createRacket() {
        return new WilsonRacket();
    }
}
