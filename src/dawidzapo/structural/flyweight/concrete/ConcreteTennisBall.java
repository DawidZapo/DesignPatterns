package dawidzapo.structural.flyweight.concrete;

import dawidzapo.structural.flyweight.flyweight_interface.Brand;
import dawidzapo.structural.flyweight.flyweight_interface.TennisBall;

public class ConcreteTennisBall implements TennisBall {
    private Brand brand;

    public ConcreteTennisBall(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void displayBrand() {
        System.out.println("Tennis ball brand: " + brand);
    }
}
