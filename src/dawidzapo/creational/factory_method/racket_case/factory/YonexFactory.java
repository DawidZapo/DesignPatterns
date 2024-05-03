package dawidzapo.creational.factory_method.racket_case.factory;

import dawidzapo.creational.factory_method.racket_case.rackets.Racket;
import dawidzapo.creational.factory_method.racket_case.rackets.YonexRacket;

public class YonexFactory extends Factory{

    @Override
    public Racket createRacket() {
        return new YonexRacket();
    }
}
