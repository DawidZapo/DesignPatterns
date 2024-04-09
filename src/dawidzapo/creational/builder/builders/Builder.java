package dawidzapo.creational.builder.builders;

import dawidzapo.creational.builder.houses.HouseType;

public interface Builder {
    void setHouseType(HouseType houseType);
    void setWindows(int windows);
    void setDoors(int doors);
    void setPool(boolean pool);
    void setGarage(boolean garage);
}
