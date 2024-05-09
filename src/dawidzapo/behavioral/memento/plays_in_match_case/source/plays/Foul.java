package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.FoulType;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

public class Foul extends Play{
    private Long foulOnPlayerId;
    private FoulType foulType;
    private Zone zone;

    public void setFoulOnPlayerId(Long foulOnPlayerId) {
        this.foulOnPlayerId = foulOnPlayerId;
    }

    public void setFoulType(FoulType foulType) {
        this.foulType = foulType;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
}
