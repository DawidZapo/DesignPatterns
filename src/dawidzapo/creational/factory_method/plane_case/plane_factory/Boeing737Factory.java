package dawidzapo.creational.factory_method.plane_case.plane_factory;

import dawidzapo.creational.factory_method.plane_case.planes.boeing.Boeing737;
import dawidzapo.creational.factory_method.plane_case.planes.Plane;

public class Boeing737Factory extends PlaneFactory{
    @Override
    public Plane createPlane() {
        return new Boeing737();
    }
}
