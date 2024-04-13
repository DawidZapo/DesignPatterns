package dawidzapo.structural.decorator;

import dawidzapo.structural.decorator.commonInterface.Pizza;
import dawidzapo.structural.decorator.component.PlainPizza;
import dawidzapo.structural.decorator.decorator.CheeseDecorator;
import dawidzapo.structural.decorator.decorator.MushroomDecorator;
import dawidzapo.structural.decorator.decorator.SalamiDecorator;

public class Demo {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        pizza = new CheeseDecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        pizza = new MushroomDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

    }
}
