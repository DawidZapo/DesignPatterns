package dawidzapo.creational.factory_method.racket_case.rackets;

public class WilsonRacket implements Racket{
    @Override
    public void smash() {
        System.out.println("Wilson Racket: Upsss... your racket is smashed");
    }

    @Override
    public void restring() {
        System.out.println("Wilson Racket: Your racket is currently under maintenance");
    }
}
