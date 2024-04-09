package dawidzapo.creational.builder.houses;

public class House {
    private final HouseType houseType;
    private final int windows;
    private final int doors;
    private final boolean garage;
    private final boolean pool;

    public House(HouseType houseType, int windows, int doors, boolean garage, boolean pool) {
        this.houseType = houseType;
        this.windows = windows;
        this.doors = doors;
        this.garage = garage;
        this.pool = pool;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseType=" + houseType +
                ", windows=" + windows +
                ", doors=" + doors +
                ", garage=" + garage +
                ", pool=" + pool +
                '}';
    }
}
