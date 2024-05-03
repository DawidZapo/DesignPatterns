package dawidzapo.creational.factory_method.plane_case;

import dawidzapo.creational.factory_method.plane_case.plane_factory.AirbusA320Factory;
import dawidzapo.creational.factory_method.plane_case.plane_factory.AirbusA380Factory;
import dawidzapo.creational.factory_method.plane_case.plane_factory.Boeing737Factory;
import dawidzapo.creational.factory_method.plane_case.plane_factory.PlaneFactory;
import dawidzapo.creational.factory_method.plane_case.planes.Plane;

public class Demo {
    private static PlaneFactory factory;
    public static void main(String[] args) {
        factory = new AirbusA320Factory();

        Plane plane1 = factory.createPlane();
        plane1.getInfo();

        factory = new AirbusA380Factory();
        Plane plane2 = factory.createPlane();
        plane2.getInfo();

        factory = new Boeing737Factory();
        Plane plane3 = factory.createPlane();
        plane3.getInfo();
    }
}
