package dawidzapo.creational.abstract_factory.sports_case.apparel.shoes;

public class WilsonShoes implements Shoes{
    @Override
    public void run() {
        System.out.println("Running in: " + getClass().getSimpleName());
    }
}
