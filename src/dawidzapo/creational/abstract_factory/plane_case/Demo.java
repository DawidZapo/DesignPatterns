package dawidzapo.creational.abstract_factory.plane_case;

import dawidzapo.creational.abstract_factory.plane_case.airplane.Airplane;
import dawidzapo.creational.abstract_factory.plane_case.factories.AirbusFactory;
import dawidzapo.creational.abstract_factory.plane_case.factories.BoeingFactory;
import dawidzapo.creational.abstract_factory.plane_case.factories.Factory;

public class Demo {
    private static Factory factory;
    public static void main(String[] args) {
        factory = new AirbusFactory();
        Airplane airplane1 = factory.createSmallPlane();
        Airplane airplane2 = factory.createMediumPlane();
        Airplane airplane3 = factory.createLargePlane();

        factory = new BoeingFactory();
        Airplane airplane4 = factory.createSmallPlane();
        Airplane airplane5 = factory.createMediumPlane();
        Airplane airplane6 = factory.createLargePlane();

        System.out.println(airplane1);
        System.out.println(airplane4);
    }
}
