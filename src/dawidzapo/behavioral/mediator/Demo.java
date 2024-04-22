package dawidzapo.behavioral.mediator;

import dawidzapo.behavioral.mediator.component.Boat;
import dawidzapo.behavioral.mediator.component.NavyBoat;
import dawidzapo.behavioral.mediator.component.PrivateBoat;
import dawidzapo.behavioral.mediator.mediator_interface.ControlTower;
import dawidzapo.behavioral.mediator.mediator_interface.PortControlTower;

public class Demo {
    public static void main(String[] args) {
        ControlTower portControlTower = new PortControlTower();

        Boat boat1 = new PrivateBoat(portControlTower);
        Boat boat2 = new NavyBoat(portControlTower);

        boat1.requestDocking();
        boat2.requestDocking();
    }
}
