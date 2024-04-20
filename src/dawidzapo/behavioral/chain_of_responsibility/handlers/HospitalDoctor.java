package dawidzapo.behavioral.chain_of_responsibility.handlers;

import dawidzapo.behavioral.chain_of_responsibility.common_interface.InjuryHandler;
import dawidzapo.behavioral.chain_of_responsibility.injury.Injury;
import dawidzapo.behavioral.chain_of_responsibility.injury.Severity;

public class HospitalDoctor implements InjuryHandler {
    private InjuryHandler injuryHandler;

    @Override
    public void handleInjury(Injury injury) {
        if(injury.getSeverity().equals(Severity.SEVERE)){
            System.out.println("Injury " + injury + " handled at level: " + getClass().getSimpleName());
        }
        else{
            injuryHandler.handleInjury(injury);
        }
    }

    @Override
    public void setNextHandler(InjuryHandler nextHandler) {
        this.injuryHandler = nextHandler;
    }
}
