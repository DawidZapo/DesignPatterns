package dawidzapo.creational.factory_method.factory;

import dawidzapo.creational.factory_method.rackets.Racket;

public abstract class Factory {

    public void renderRacket(){
        Racket racket = createRacket();
        racket.smash();
        racket.restring();
    }

    public abstract Racket createRacket();
}
