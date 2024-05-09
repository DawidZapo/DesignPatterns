package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.Match;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

import java.time.LocalDateTime;

public class Steal extends Play{
    private Long stolenFromPlayerId;
    private Zone zone;

    public Steal(Long id, LocalDateTime localDateTime, Long playerId, Match matchId, Long stolenFromPlayerId, Zone zone) {
        super(id, localDateTime, playerId, matchId);
        this.stolenFromPlayerId = stolenFromPlayerId;
        this.zone = zone;
    }
}
