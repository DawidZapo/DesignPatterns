package dawidzapo.creational.abstract_factory.plane_case.airbus;

import dawidzapo.creational.abstract_factory.plane_case.airplane.Airplane;

public abstract class Airbus extends Airplane {
    public Airbus(String model){
        super("Airbus", model);
    }
}
