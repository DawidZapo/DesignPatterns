package dawidzapo.creational.builder.plane_case.plane;

public class Boeing {
    private String model;
    private int capacity;
    private double range; // km
    private double length; // m
    private double wingspan; // m
    private double maxSpeed; // Mach

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Boeing{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", range=" + range +
                ", length=" + length +
                ", wingspan=" + wingspan +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
