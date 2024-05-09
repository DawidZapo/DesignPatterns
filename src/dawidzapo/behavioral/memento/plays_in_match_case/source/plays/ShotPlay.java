package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Contested;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.ShotType;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

public class ShotPlay extends Play {
    private ShotType shotType;
    private Zone zone;
    private boolean made;
    private Contested contested;
    private int worth;


    public void setShotType(ShotType shotType) {
        this.shotType = shotType;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public void setMade(boolean made) {
        this.made = made;
    }

    public void setContested(Contested contested) {
        this.contested = contested;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    @Override
    public String toString() {
        return "ShotPlay{" +
                "shotType=" + shotType +
                ", zone=" + zone +
                ", made=" + made +
                ", contested=" + contested +
                ", worth=" + worth +
                "} " + super.toString();
    }
}
