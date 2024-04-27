package dawidzapo.creational.prototype.basic_case.object;

import dawidzapo.creational.prototype.basic_case.clone_interface.Cloneable;

import java.util.Objects;

public class Car implements Cloneable<Car> {
    private String brand;
    private double mileage;
    private Color color;

    public Car(String brand, double mileage, Color color) {
        this.brand = brand;
        this.mileage = mileage;
        this.color = color;
    }

    @Override
    public Car clone() {
        return new Car(brand,mileage,color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.mileage, mileage) == 0 &&
                Objects.equals(brand, car.brand) &&
                color == car.color;
    }
}
