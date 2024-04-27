package dawidzapo.creational.prototype.basic_case;

import dawidzapo.creational.prototype.basic_case.object.Car;
import dawidzapo.creational.prototype.basic_case.object.Color;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Audi", 10000, Color.BLUE);
        Car anotherCar = car.clone();

        if(car != anotherCar){
            System.out.println("Different object!");
            if(car.equals(anotherCar)){
                System.out.println("Same fields");
            }
            else{
                System.out.println("Different fields");
            }
        }
        else{
            System.out.println("Same object!");
        }
    }
}
