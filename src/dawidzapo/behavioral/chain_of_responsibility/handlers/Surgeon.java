package dawidzapo.behavioral.chain_of_responsibility.handlers;

import dawidzapo.behavioral.chain_of_responsibility.common_interface.InjuryHandler;
import dawidzapo.behavioral.chain_of_responsibility.injury.Injury;
import dawidzapo.behavioral.chain_of_responsibility.injury.Severity;

public class Surgeon implements InjuryHandler {
    private InjuryHandler injuryHandler;
    @Override
    public void handleInjury(Injury injury) {
        if(injury.getSeverity().equals(Severity.CRITICAL)){
            System.out.println("Injury " + injury + " handled at level: " + getClass().getSimpleName());
        }
        else{
            System.out.println("Injury " + injury + " cannot be handled at the moment...");
        }
    }

    @Override
    public void setNextHandler(InjuryHandler nextHandler) {
        // no other next handler
    }
}
