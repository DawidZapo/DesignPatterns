package dawidzapo.behavioral.chain_of_responsibility;

import dawidzapo.behavioral.chain_of_responsibility.common_interface.InjuryHandler;
import dawidzapo.behavioral.chain_of_responsibility.handlers.ClubDoctor;
import dawidzapo.behavioral.chain_of_responsibility.handlers.HospitalDoctor;
import dawidzapo.behavioral.chain_of_responsibility.handlers.Physiotherapist;
import dawidzapo.behavioral.chain_of_responsibility.handlers.Surgeon;
import dawidzapo.behavioral.chain_of_responsibility.injury.AnatomyPart;
import dawidzapo.behavioral.chain_of_responsibility.injury.Injury;
import dawidzapo.behavioral.chain_of_responsibility.injury.Severity;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        InjuryHandler injuryHandler1 = new Physiotherapist();
        InjuryHandler injuryHandler2 = new ClubDoctor();
        InjuryHandler injuryHandler3 = new HospitalDoctor();
        InjuryHandler injuryHandler4 = new Surgeon();

        injuryHandler1.setNextHandler(injuryHandler2);
        injuryHandler2.setNextHandler(injuryHandler3);
        injuryHandler3.setNextHandler(injuryHandler4);

        Injury injury1 = new Injury(Severity.MINOR, LocalDate.of(2024,4,30), AnatomyPart.LEG);
        Injury injury2 = new Injury(Severity.MODERATE, LocalDate.of(2024,5,28), AnatomyPart.ANKLE);
        Injury injury3 = new Injury(Severity.SEVERE, LocalDate.of(2024,7,23), AnatomyPart.HIP);
        Injury injury4 = new Injury(Severity.CRITICAL, LocalDate.of(2024,10,3), AnatomyPart.BACK);
        Injury injury5 = new Injury(Severity.LIFE_THREATENING, LocalDate.of(2025,1,10), AnatomyPart.HEAD);

        injuryHandler1.handleInjury(injury1);
        injuryHandler1.handleInjury(injury2);
        injuryHandler1.handleInjury(injury3);
        injuryHandler1.handleInjury(injury4);
        injuryHandler1.handleInjury(injury5);

    }
}
