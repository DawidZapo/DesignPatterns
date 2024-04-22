package dawidzapo.behavioral.mediator.component;

import dawidzapo.behavioral.mediator.mediator_interface.ControlTower;

public class NavyBoat implements Boat{
    private ControlTower controlTower;

    public NavyBoat(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    public void requestDocking() {
        controlTower.requestDocking(this);
    }

    @Override
    public void requestMakeSail() {
        controlTower.requestMakeSail(this);
    }

    @Override
    public void getNotified(String message) {
        System.out.println(message);
    }
}
