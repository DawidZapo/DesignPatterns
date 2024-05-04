package dawidzapo.creational.builder.house_case.builders;

import dawidzapo.creational.builder.house_case.houses.House;
import dawidzapo.creational.builder.house_case.houses.HouseType;

public class HouseBuilder implements Builder {

    private HouseType houseType;
    private int windows;
    private int doors;
    private boolean garage;
    private boolean pool;

    @Override
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setPool(boolean pool) {
        this.pool = pool;
    }

    @Override
    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public House getResult(){
        return new House(houseType,windows,doors,pool,garage);
    }
}
