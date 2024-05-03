package dawidzapo.creational.factory_method.plane_case.plane_factory;

import dawidzapo.creational.factory_method.plane_case.planes.Plane;
import dawidzapo.creational.factory_method.plane_case.planes.airbus.AirbusA320;

public class AirbusA320Factory extends PlaneFactory{
    @Override
    public Plane createPlane() {
        return new AirbusA320();
    }
}
