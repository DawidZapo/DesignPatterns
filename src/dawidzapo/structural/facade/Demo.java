package dawidzapo.structural.facade;

import dawidzapo.structural.facade.facade.LaundryFacade;
import dawidzapo.structural.facade.third_party_complex_lib.SmartDryer;
import dawidzapo.structural.facade.third_party_complex_lib.SmartWashingMachine;

public class Demo {
    public static void main(String[] args) {
        LaundryFacade laundryFacade = new LaundryFacade(new SmartDryer(), new SmartWashingMachine());
        laundryFacade.startLaundryAndDrying();
    }
}
