package dawidzapo.creational.factory_method.plane_case.plane_factory;

import dawidzapo.creational.factory_method.plane_case.planes.Plane;
import dawidzapo.creational.factory_method.plane_case.planes.boeing.Boeing777;

public class Boeing777Factory extends PlaneFactory{
    @Override
    public Plane createPlane() {
        return new Boeing777();
    }
}
