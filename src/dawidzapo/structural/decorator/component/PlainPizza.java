package dawidzapo.structural.decorator.component;

import dawidzapo.structural.decorator.common_interface.Pizza;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double getCost() {
        return 20.0;
    }
}
