package dawidzapo.creational.abstractFactory.sportsCase.apparel.uniform;

public class WilsonUniform implements Uniform{
    @Override
    public void lookGood() {
        System.out.println("Looking good in: " + getClass().getSimpleName());
    }
}
