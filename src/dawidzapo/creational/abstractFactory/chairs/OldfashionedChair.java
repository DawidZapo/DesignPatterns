package dawidzapo.creational.abstractFactory.chairs;

public class OldfashionedChair implements Chair{
    @Override
    public void sit() {
        System.out.println("Sitting on a old-fashioned chair");
    }
}
