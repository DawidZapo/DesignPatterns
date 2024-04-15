package dawidzapo.structural.facade.facade;

import dawidzapo.structural.facade.third_party_complex_lib.SmartDryer;
import dawidzapo.structural.facade.third_party_complex_lib.SmartWashingMachine;

public class LaundryFacade {
    private SmartDryer smartDryer;
    private SmartWashingMachine smartWashingMachine;

    public LaundryFacade(SmartDryer smartDryer, SmartWashingMachine smartWashingMachine) {
        this.smartDryer = smartDryer;
        this.smartWashingMachine = smartWashingMachine;
    }

    public void startLaundryAndDrying(){
        smartWashingMachine.loadTheWashingMachine();
        smartWashingMachine.startLaundry();
        smartWashingMachine.endLaundry();
        smartWashingMachine.emptyTheWashingMachine();

        smartDryer.loadTheDryer();
        smartDryer.startTheDryer();
        smartDryer.endTheDryer();
        smartDryer.emptyTheDryer();
    }
}
