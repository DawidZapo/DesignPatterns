package dawidzapo.structural.decorator.decorator;

import dawidzapo.structural.decorator.commonInterface.Pizza;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }
}
