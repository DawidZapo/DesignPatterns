package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

public class Steal extends Play{
    private Long stolenFromPlayerId;
    private Zone zone;

    public void setStolenFromPlayerId(Long stolenFromPlayerId) {
        this.stolenFromPlayerId = stolenFromPlayerId;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
}
