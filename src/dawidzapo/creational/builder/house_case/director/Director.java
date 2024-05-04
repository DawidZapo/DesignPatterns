package dawidzapo.creational.builder.house_case.director;

import dawidzapo.creational.builder.house_case.builders.Builder;
import dawidzapo.creational.builder.house_case.houses.HouseType;

public class Director {
    public void buildModernHouse(Builder builder){
        builder.setHouseType(HouseType.MODERN);
        builder.setWindows(10);
        builder.setDoors(4);
        builder.setGarage(true);
        builder.setPool(false);
    }

    public void buildOldfashionedHouse(Builder builder){
        builder.setHouseType(HouseType.OLDFASHIONED);
        builder.setWindows(7);
        builder.setDoors(1);
        builder.setGarage(false);
        builder.setPool(false);
    }

    public void buildLuxuriousMHouse(Builder builder){
        builder.setHouseType(HouseType.LUXURIOUS);
        builder.setWindows(20);
        builder.setDoors(4);
        builder.setGarage(true);
        builder.setPool(true);
    }
    public void buildFlat(Builder builder){
        builder.setHouseType(HouseType.FLAT);
        builder.setWindows(5);
        builder.setDoors(1);
        builder.setGarage(false);
        builder.setPool(false);
    }
}
