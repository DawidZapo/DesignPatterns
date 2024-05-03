package dawidzapo.creational.abstract_factory.plane_case.factories;

import dawidzapo.creational.abstract_factory.plane_case.airplane.Airplane;
import dawidzapo.creational.abstract_factory.plane_case.boeing.Boeing737;
import dawidzapo.creational.abstract_factory.plane_case.boeing.Boeing777;
import dawidzapo.creational.abstract_factory.plane_case.boeing.Boeing787;

public class BoeingFactory implements Factory{
    @Override
    public Airplane createSmallPlane() {
        return new Boeing737();
    }

    @Override
    public Airplane createMediumPlane() {
        return new Boeing777();
    }

    @Override
    public Airplane createLargePlane() {
        return new Boeing787();
    }
}
