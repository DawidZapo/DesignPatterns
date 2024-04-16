package dawidzapo.structural.flyweight;

import dawidzapo.structural.flyweight.factory.TennisBallFactory;
import dawidzapo.structural.flyweight.flyweight_interface.Brand;
import dawidzapo.structural.flyweight.flyweight_interface.TennisBall;

public class Demo {
    public static void main(String[] args) {
        TennisBallFactory tennisBallFactory = new TennisBallFactory();

        TennisBall tennisBall1 = tennisBallFactory.getTennisBall(Brand.WILSON);
        TennisBall tennisBall2 = tennisBallFactory.getTennisBall(Brand.HEAD);
        TennisBall tennisBall3 = tennisBallFactory.getTennisBall(Brand.DUNLOP);
        TennisBall tennisBall4 = tennisBallFactory.getTennisBall(Brand.WILSON);

        if(tennisBall1.equals(tennisBall4)){
            System.out.println("Exact object"); // will work
        }
        if(tennisBall2.equals(tennisBall3)){
            System.out.println("Exact object"); // wont work
        }
    }
}
