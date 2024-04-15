package dawidzapo.creational.factory_method.factory;

import dawidzapo.creational.factory_method.rackets.Racket;
import dawidzapo.creational.factory_method.rackets.YonexRacket;

public class YonexFactory extends Factory{

    @Override
    public Racket createRacket() {
        return new YonexRacket();
    }
}
