package dawidzapo.creational.abstract_factory.sports_case.apparel.uniform;

public class HeadUniform implements Uniform{
    @Override
    public void lookGood() {
        System.out.println("Looking good in: " + getClass().getSimpleName());
    }
}
