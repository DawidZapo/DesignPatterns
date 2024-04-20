package dawidzapo.behavioral.chain_of_responsibility.common_interface;

import dawidzapo.behavioral.chain_of_responsibility.injury.Injury;

public interface InjuryHandler {
    void handleInjury(Injury injury);
    void setNextHandler(InjuryHandler nextHandler);
}
