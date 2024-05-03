package dawidzapo.creational.factory_method.plane_case.plane_factory;

import dawidzapo.creational.factory_method.plane_case.planes.Plane;
import dawidzapo.creational.factory_method.plane_case.planes.airbus.AirbusA380;

public class AirbusA380Factory extends PlaneFactory{
    @Override
    public Plane createPlane() {
        return new AirbusA380();
    }
}
