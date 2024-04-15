package dawidzapo.creational.abstract_factory.sports_case.apparel.racket;

public class WilsonRacket implements Racket{
    @Override
    public void smash() {
        System.out.println("Smashing: " + getClass().getSimpleName());
    }

    @Override
    public void restring(double tension) {
        System.out.println("Restringing: " + getClass().getSimpleName() + " with " + tension + " kg");
    }
}
