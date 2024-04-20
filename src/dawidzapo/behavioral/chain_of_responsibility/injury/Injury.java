package dawidzapo.behavioral.chain_of_responsibility.injury;

import java.time.LocalDate;

public class Injury {
    private Severity severity;
    private LocalDate expectedRecoveryTime;
    private AnatomyPart anatomyPart;

    public Injury(Severity severity, LocalDate expectedRecoveryTime, AnatomyPart anatomyPart) {
        this.severity = severity;
        this.expectedRecoveryTime = expectedRecoveryTime;
        this.anatomyPart = anatomyPart;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public LocalDate getExpectedRecoveryTime() {
        return expectedRecoveryTime;
    }

    public void setExpectedRecoveryTime(LocalDate expectedRecoveryTime) {
        this.expectedRecoveryTime = expectedRecoveryTime;
    }

    public AnatomyPart getAnatomyPart() {
        return anatomyPart;
    }

    public void setAnatomyPart(AnatomyPart anatomyPart) {
        this.anatomyPart = anatomyPart;
    }

    @Override
    public String toString() {
        return "Injury{" +
                "severity=" + severity +
                ", expectedRecoveryTime=" + expectedRecoveryTime +
                ", anatomyPart=" + anatomyPart +
                '}';
    }
}
