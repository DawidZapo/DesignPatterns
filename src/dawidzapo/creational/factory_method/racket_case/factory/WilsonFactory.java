package dawidzapo.creational.factory_method.racket_case.factory;

import dawidzapo.creational.factory_method.racket_case.rackets.Racket;
import dawidzapo.creational.factory_method.racket_case.rackets.WilsonRacket;

public class WilsonFactory extends Factory{

    @Override
    public Racket createRacket() {
        return new WilsonRacket();
    }
}
