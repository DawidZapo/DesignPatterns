package dawidzapo.behavioral.mediator.mediator_interface;

import dawidzapo.behavioral.mediator.component.Boat;
import dawidzapo.behavioral.mediator.component.NavyBoat;

import java.util.Random;

public class PortControlTower implements ControlTower{
    private static Random random = new Random();
    @Override
    public void requestDocking(Boat boat) {
        int threshold = 5;
        if(boat instanceof NavyBoat){
            threshold = -1;
        }
        if(random.nextInt(10) > threshold){
            boat.getNotified("Docking: Approved");
        }
        else{
            boat.getNotified("Docking: Not approved");
        }
    }

    @Override
    public void requestMakeSail(Boat boat) {
        int threshold = 5;
        if(boat instanceof NavyBoat){
            threshold = -1;
        }
        if(random.nextInt(10) > threshold){
            boat.getNotified("Making sail: Approved");
        }
        else{
            boat.getNotified("Making sail: Not approved");
        }
    }
}
