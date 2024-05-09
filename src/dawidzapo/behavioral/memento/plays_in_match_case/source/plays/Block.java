package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

public class Block extends Play{
    private Long blockedPlayerId;
    private Zone zone;

    public void setBlockedPlayerId(Long blockedPlayerId) {
        this.blockedPlayerId = blockedPlayerId;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
}
