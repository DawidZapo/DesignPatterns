package dawidzapo.creational.builder.house_case;

import dawidzapo.creational.builder.house_case.builders.HouseBuilder;
import dawidzapo.creational.builder.house_case.director.Director;
import dawidzapo.creational.builder.house_case.houses.House;

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
