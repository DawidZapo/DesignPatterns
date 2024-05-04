package dawidzapo.creational.builder.plane_case.builder;

import dawidzapo.creational.builder.plane_case.plane.Boeing;

public class BoeingBuilder implements Builder{
    private Boeing boeing;

    @Override
    public void reset() {
        this.boeing = new Boeing();
    }

    @Override
    public void setModel(String model) {
        this.boeing.setModel(model);
    }

    @Override
    public void setCapacity(int capacity) {
        this.boeing.setCapacity(capacity);
    }

    @Override
    public void setRange(double range) {
        this.boeing.setRange(range);
    }

    @Override
    public void setLength(double length) {
        this.boeing.setLength(length);
    }

    @Override
    public void setWingspan(double wingspan) {
        this.boeing.setWingspan(wingspan);
    }

    @Override
    public void setMaxSpeed(double maxSpeed) {
        this.boeing.setMaxSpeed(maxSpeed);
    }
    @Override
    public Boeing getResult(){
        return this.boeing;
    }
}
