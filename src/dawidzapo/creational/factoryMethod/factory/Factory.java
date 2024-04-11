package dawidzapo.creational.factoryMethod.factory;

import dawidzapo.creational.factoryMethod.rackets.Racket;

public abstract class Factory {

    public void renderRacket(){
        Racket racket = createRacket();
        racket.smash();
        racket.restring();
    }

    public abstract Racket createRacket();
}
