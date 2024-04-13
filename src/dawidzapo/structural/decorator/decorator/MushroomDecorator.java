package dawidzapo.structural.decorator.decorator;

import dawidzapo.structural.decorator.commonInterface.Pizza;

public class MushroomDecorator extends PizzaDecorator{
    public MushroomDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 4.0;
    }
}
