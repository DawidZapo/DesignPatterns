package dawidzapo.creational.builder.plane_case.builder;

import dawidzapo.creational.builder.plane_case.plane.Boeing;

public interface Builder {
    void reset();
    void setModel(String model);
    void setCapacity(int capacity);
    void setRange(double range);
    void setLength(double length);
    void setWingspan(double wingspan);
    void setMaxSpeed(double maxSpeed);
    Boeing getResult();
}
