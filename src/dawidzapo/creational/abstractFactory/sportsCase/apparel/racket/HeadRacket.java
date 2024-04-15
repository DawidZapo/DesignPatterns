package dawidzapo.creational.abstractFactory.sportsCase.apparel.racket;

public class HeadRacket implements Racket{
    @Override
    public void smash() {
        System.out.println("Smashing: " + getClass().getSimpleName());
    }

    @Override
    public void restring(double tension) {
        System.out.println("Restringing: " + getClass().getSimpleName() + " with " + tension + " kg");
    }
}
