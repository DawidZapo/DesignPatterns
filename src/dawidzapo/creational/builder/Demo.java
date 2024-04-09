package dawidzapo.creational.builder;

import dawidzapo.creational.builder.builders.HouseBuilder;
import dawidzapo.creational.builder.director.Director;
import dawidzapo.creational.builder.houses.House;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();
        director.buildLuxuriousMHouse(houseBuilder);
        House house1 = houseBuilder.getResult();
        System.out.println(house1);

        director.buildModernHouse(houseBuilder);
        House house2 = houseBuilder.getResult();
        System.out.println(house2);

        director.buildOldfashionedHouse(houseBuilder);
        House house3 = houseBuilder.getResult();
        System.out.println(house3);
    }
}
