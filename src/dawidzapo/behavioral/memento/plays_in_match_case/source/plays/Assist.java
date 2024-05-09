package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

public class Assist extends Play{
    private Zone fromZone;
    private Zone toZone;
    private Long assistToPlayerId;

    public void setFromZone(Zone fromZone) {
        this.fromZone = fromZone;
    }

    public void setToZone(Zone toZone) {
        this.toZone = toZone;
    }

    public void setAssistToPlayerId(Long assistToPlayerId) {
        this.assistToPlayerId = assistToPlayerId;
    }
}
