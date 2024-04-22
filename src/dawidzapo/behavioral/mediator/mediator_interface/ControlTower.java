package dawidzapo.behavioral.mediator.mediator_interface;

import dawidzapo.behavioral.mediator.component.Boat;

public interface ControlTower {
    void requestDocking(Boat boat);
    void requestMakeSail(Boat boat);
}
