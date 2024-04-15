package dawidzapo.structural.decorator.decorator;

import dawidzapo.structural.decorator.common_interface.Pizza;

public class SalamiDecorator extends PizzaDecorator{
    public SalamiDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Salami";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 5.0;
    }
}
