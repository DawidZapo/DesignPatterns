package dawidzapo.creational.factory_method.racket_case.rackets;

public class YonexRacket implements Racket{
    @Override
    public void smash() {
        System.out.println("Yonex Racket: Upsss... your racket is smashed");
    }

    @Override
    public void restring() {
        System.out.println("Yonex Racket: Your racket is currently under maintenance");
    }
}
