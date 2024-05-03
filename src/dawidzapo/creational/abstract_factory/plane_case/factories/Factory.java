package dawidzapo.creational.abstract_factory.plane_case.factories;

import dawidzapo.creational.abstract_factory.plane_case.airplane.Airplane;

public interface Factory {
    Airplane createSmallPlane();
    Airplane createMediumPlane();
    Airplane createLargePlane();
}
