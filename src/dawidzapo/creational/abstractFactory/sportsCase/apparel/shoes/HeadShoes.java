package dawidzapo.creational.abstractFactory.sportsCase.apparel.shoes;

public class HeadShoes implements Shoes{
    @Override
    public void run() {
        System.out.println("Running in: " + getClass().getSimpleName());
    }
}
