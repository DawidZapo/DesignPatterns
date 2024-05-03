package dawidzapo.creational.abstract_factory.plane_case.factories;

import dawidzapo.creational.abstract_factory.plane_case.airbus.AirbusA320;
import dawidzapo.creational.abstract_factory.plane_case.airbus.AirbusA340;
import dawidzapo.creational.abstract_factory.plane_case.airbus.AirbusA380;
import dawidzapo.creational.abstract_factory.plane_case.airplane.Airplane;

public class AirbusFactory implements Factory{
    @Override
    public Airplane createSmallPlane() {
        return new AirbusA320();
    }

    @Override
    public Airplane createMediumPlane() {
        return new AirbusA340();
    }

    @Override
    public Airplane createLargePlane() {
        return new AirbusA380();
    }
}
