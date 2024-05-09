package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.Match;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

import java.time.LocalDateTime;

public class Assist extends Play{
    private Zone fromZone;
    private Zone toZone;
    private Long assistToPlayerId;

    public Assist(Long id, LocalDateTime localDateTime, Long playerId, Match matchId, Zone fromZone, Zone toZone, Long assistToPlayerId) {
        super(id, localDateTime, playerId, matchId);
        this.fromZone = fromZone;
        this.toZone = toZone;
        this.assistToPlayerId = assistToPlayerId;
    }
}
