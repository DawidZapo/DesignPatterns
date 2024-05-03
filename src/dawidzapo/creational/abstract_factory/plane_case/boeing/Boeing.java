package dawidzapo.creational.abstract_factory.plane_case.boeing;

import dawidzapo.creational.abstract_factory.plane_case.airplane.Airplane;

public abstract class Boeing extends Airplane {
    public Boeing(String model){
        super("Boeing", model);
    }
}
