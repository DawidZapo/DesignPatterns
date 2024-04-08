package dawidzapo.creational.abstractFactory;

import dawidzapo.creational.abstractFactory.app.House;
import dawidzapo.creational.abstractFactory.factories.FurnitureFactory;
import dawidzapo.creational.abstractFactory.factories.ModernFurnitureFactory;
import dawidzapo.creational.abstractFactory.factories.OldfashionedFurnitureFactory;

public class Demo {
    public static void main(String[] args) {
        House modernHouse = configureHouse("Modern");
        modernHouse.haveParty();

        House oldFashionedHouse = configureHouse("Oldfashioned");
        oldFashionedHouse.haveParty();

    }

    private static House configureHouse(String style){
        House house;
        FurnitureFactory factory;

        if(style.equals("Modern")){
            factory = new ModernFurnitureFactory();
        }
        else{
            factory = new OldfashionedFurnitureFactory();
        }

        house = new House(factory);
        return house;
    }
}
