package dawidzapo.creational.abstractFactory.sportsCase.apparel.uniform;

public class HeadUniform implements Uniform{
    @Override
    public void lookGood() {
        System.out.println("Looking good in: " + getClass().getSimpleName());
    }
}
