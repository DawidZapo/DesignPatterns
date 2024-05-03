package dawidzapo.creational.factory_method.racket_case.factory;

import dawidzapo.creational.factory_method.racket_case.rackets.Racket;

public abstract class Factory {

    public void renderRacket(){
        Racket racket = createRacket();
        racket.smash();
        racket.restring();
    }

    public abstract Racket createRacket();
}
