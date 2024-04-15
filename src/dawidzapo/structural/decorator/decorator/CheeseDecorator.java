package dawidzapo.structural.decorator.decorator;

import dawidzapo.structural.decorator.common_interface.Pizza;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 3.0;
    }
}
